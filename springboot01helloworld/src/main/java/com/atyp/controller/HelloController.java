package com.atyp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author RickYinPeng
 * @ClassName HelloController
 * @Description
 * @date 2019/6/30/18:20
 */
@Controller
public class HelloController {

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(){
        return "Hello world";
    }
}
