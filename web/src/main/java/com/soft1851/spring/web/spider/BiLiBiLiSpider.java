package com.soft1851.spring.web.spider;/*@ClassName BiLiBiLiSpider
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entity.Rank;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class BiLiBiLiSpider {
    private static  final  Integer SUCCESS = 200;
    public static List<Rank> getBanks(){
        List<Rank> ranks = new ArrayList<>();
        String userAgent ="Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Mobile Safari/537.36";
        String url = "https://www.bilibili.com/ranking";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            Thread.sleep(4000);
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent",userAgent);
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpGet,context);
            System.out.println(response.getStatusLine());
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            if (statusCode == SUCCESS){
                HttpEntity entity = response.getEntity();
                System.out.println(entity);
                if(entity != null){
                    String res = EntityUtils.toString(entity);
                    Document document = Jsoup.parse(res);
                    Elements scripts = document.getElementsByTag("script");
                    String wholeData = scripts.get(5).html();
                    String data = wholeData.substring(wholeData.indexOf("rankList")+10,wholeData.indexOf("rankRouteParams") - 2);
                    JSONArray jsonArray =  JSONArray.parseArray(data);
                    jsonArray.forEach(o -> {
                        JSONObject json = JSONObject.parseObject(o.toString());
                        Rank rank =  Rank.builder()
                                .title(json.getString("title"))
                                        .author(json.getString("author"))
                                        .pic(json.getString("pic"))
                                        .duration(json.getString("dyration"))
                                        .build();
                                ranks.add(rank);
                    });
//                    Elements elements = document.getElementsByClass("rank-item");
//
//                    for (Element element : elements){
//                        String num = element.child(0).text();
//                        System.out.println(num);
//                        Element contentEle = element.child(1);
//                        String title = contentEle.select(".title").text();
//                        System.out.println(title);
//                        Elements img = contentEle.select(".lazy-img img");
//                        String cover = img.attr("src");
//                        Rank rank =  Rank.builder().id(Integer.parseInt(num)).title(title).cover(cover).build();
//                        ranks.add(rank);
//                    }
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ranks;
    }

    public static void main(String[] args) {
List<Rank> ranks = getBanks();
ranks.forEach(System.out::println);
        }
}
