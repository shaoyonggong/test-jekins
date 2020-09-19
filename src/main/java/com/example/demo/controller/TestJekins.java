package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Description
 * @Author shaoyonggong
 * @Date 2020/9/19
 */
@Controller
@RequestMapping(value = "/")
public class TestJekins {
    @ResponseBody
    @RequestMapping(value = "/data")
    public String data() {
        return "hello";
    }

    @ResponseBody
    @RequestMapping(value = "/test")
    public String data2() {
        return "test";
    }
}
