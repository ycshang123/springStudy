package com.soft1851.spring.web.controller;/*@ClassName DribbbleController
 *@Description:todo
 *@author yc_shang
 *@Date2020/3/28
 *@Version 1.0
 **/

import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.service.DribbbleService;
import com.soft1851.spring.web.util.ResponseObject;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping(value ="/")
public class DribbbleController {
    @Resource
    private DribbbleService dribbbleService;
    @GetMapping(value ="dribbbles",produces = "application/json;charset=utf-8")
    @ResponseBody
    public String getDribbbles(){
        ResponseObject rs =  new ResponseObject(1,"success",dribbbleService.queryAll());
        return JSONObject.toJSONString(rs);
    }
    @GetMapping("/")
    public  String dribbble(Model model){
        model.addAttribute("dribbble",dribbbleService.queryAll());
        return "dribbble";
    }
}
