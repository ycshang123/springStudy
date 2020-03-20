package com.soft1851.spring.webDev.controller;/*@ClassName ForumController
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/19
 *@Version 1.0
 **/

import com.alibaba.fastjson.JSON;
import com.soft1851.spring.webDev.service.ForumService;
import com.soft1851.spring.webDev.util.ResponseObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "forum")
public class ForumController  {
   @Autowired
   private  ForumService forumService;

    @RequestMapping(value = "/list",produces = "application/json;charset=utf-8")
    public String getForums(){
        ResponseObject ro = new ResponseObject(1,"成功",forumService.selectAll());
        return JSON.toJSONString(ro);
    }

    @PostMapping(value = "/id", produces = "application/json;charset=utf-8")
    public  String getForum(@RequestParam Integer id){
             ResponseObject ro = new ResponseObject(1,"成功",forumService.get(id));
        return JSON.toJSONString(ro);
    }
}
