package com.qitu.timeamin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2018/3/28 0028.
 */

@Controller
@RequestMapping("/")
public class TimeController {
    @RequestMapping(value = "/hello",produces="text/html; charset=UTF-8")
    public String index() {
        return "index";
    }


    @RequestMapping(value = "/json", produces="application/json;charset=UTF-8")
    @ResponseBody
    public Map<String, Object> testRequestBody() {
        Map<String, Object> result = new HashMap<String, Object>();
        result.put("name", "韦德");
        result.put("age", 35);
        result.put("agsse", 35);
        return result;
    }
}
