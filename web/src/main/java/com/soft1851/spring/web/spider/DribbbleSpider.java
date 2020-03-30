package com.soft1851.spring.web.spider;/*@ClassName DribbbleSpider
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.gargoylesoftware.htmlunit.BrowserVersion;
import com.gargoylesoftware.htmlunit.NicelyResynchronizingAjaxController;
import com.gargoylesoftware.htmlunit.WebClient;
import com.soft1851.spring.web.entity.Dribbble;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

import java.util.ArrayList;
import java.util.List;

public class DribbbleSpider {
    private  static  final  Integer SUCCESS = 200;
    public static void getItems() throws  Exception{
        WebClient webClient = new WebClient(BrowserVersion.BEST_SUPPORTED);
        webClient.getOptions().setCssEnabled(false);
        webClient.getOptions().setJavaScriptEnabled(true);
        webClient.getOptions().setThrowExceptionOnFailingStatusCode(false);
        webClient.getOptions().setThrowExceptionOnScriptError(false);
        webClient.setAjaxController(new NicelyResynchronizingAjaxController());

    }
    public static List<Dribbble> getDribbble(){
        List<Dribbble> dribbbles = new ArrayList<>();
        String userAgent ="Mozilla/5.0 (Linux; Android 6.0; Nexus 5 Build/MRA58N) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/80.0.3987.149 Mobile Safari/537.36";
        String url ="https://dribbble.com/";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        try {
            HttpGet httpGet = new HttpGet(url);
            httpGet.setHeader("User-Agent",userAgent);
            HttpClientContext context = HttpClientContext.create();
            CloseableHttpResponse response = httpClient.execute(httpGet,context);
            int statusCode = response.getStatusLine().getStatusCode();
            System.out.println(statusCode);
            if(statusCode == SUCCESS){
                HttpEntity entity = response.getEntity();
                System.out.println(entity);
                if(entity != null){
                    String res = EntityUtils.toString(entity);
                    Document document = Jsoup.parse(res);
                    Elements elements = document.getElementsByClass("group shot-thumbnail shot-thumbnail-with-hover-overlay");
                    for(Element element : elements){
                    String img = element.child(0).child(0).child(0).child(0).child(0).child(3).attr("src");
                    String title = element.child(0).child(0).child(1).child(0).text();
                    String avatar = element.child(1).child(0).child(0).child(0).attr("src");
                    String nickname = element.child(1).child(0).child(0).child(1).text();
                    String fav = element.child(1).child(1).child(0).child(1).text();
                    String cmnt = element.child(1).child(1).child(1).child(1).text();
                    Dribbble dribbble = Dribbble.builder()
                            .cover(img)
                            .title(title)
                            .avatar(avatar)
                            .nickname(nickname)
                            .fav(Integer.parseInt(fav))
                            .cmnt(Integer.parseInt(cmnt))
                            .build();
                        System.out.println(dribbble);
                    dribbbles.add(dribbble);
                    }
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return dribbbles;
    }

    public static void main(String[] args) {
        System.out.println(getDribbble());
    }
}
