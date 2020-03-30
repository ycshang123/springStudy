package com.soft1851.spring.web.spider;/*@ClassName JueJinSpider
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entity.Topic;
import org.apache.http.HttpEntity;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class JueJinSpider {
    private static  final  Integer SUCCESS = 200;
    public static List<Topic> getTopics(){
        List<Topic> topics = new ArrayList<>();
        //目标地址
        String url ="https://short-msg-ms.juejin.im/v1/topicList?uid=5e7bffe9f265da42e26df9e4&device_id=1585184745516&token=eyJhY2Nlc3NfdG9rZW4iOiJyVlhObk5PMUdMd1diQzNJIiwicmVmcmVzaF90b2tlbiI6InVTU05UUHh5NTdtNkJTOEIiLCJ0b2tlbl90eXBlIjoibWFjIiwiZXhwaXJlX2luIjoyNTkyMDAwfQ%3D%3D&src=web&sortType=hot&page=0&pageSize=100";
        //创建HttpClient对象
        CloseableHttpClient httpClient = HttpClients.createDefault();
        //创建get对象
        HttpGet get = new HttpGet(url);
        //创建context对象
        HttpClientContext context = HttpClientContext.create();
        //创建response对象
        CloseableHttpResponse response = null;
        try {
            response =  httpClient.execute(get,context);
        }catch (IOException e){
            e.printStackTrace();
        }
//        System.out.println(response.getStatusLine());
        //如果请求成功则获取网页源码
        if (response.getStatusLine().getStatusCode() == SUCCESS){
            //获取响应体对象实体,并转成UTF-8字符串
            HttpEntity entity = response.getEntity();
            String res = null;
            try {
                res = EntityUtils.toString(entity,"UTF-8");
            } catch (IOException e) {
                e.printStackTrace();
            }
            System.out.println(res);
            JSONObject jsonObject = JSONObject.parseObject(res);
            JSONArray list = jsonObject.getJSONObject("d").getJSONArray("list");
            list.forEach(o -> {
                JSONObject json = JSONObject.parseObject(o.toString());
                Topic topic = Topic.builder()
                        .id(json.getString("objectId"))
                        .topicName(json.getString("title"))
                        .topicIcon(json.getString("icon"))
                        .follwersCount(json.getInteger("followersCount"))
                        .msgCount(json.getInteger("msgsCount"))
                        .followed(json.getBoolean("followed"))
                        .description(json.getString("description"))
                        .build();
                topics.add(topic);
            });
        }else {
            System.out.println("请求失败");
        }
        try {
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    return  topics;
    }

    public static void main(String[] args) {
        System.out.println(getTopics());
    }
}
