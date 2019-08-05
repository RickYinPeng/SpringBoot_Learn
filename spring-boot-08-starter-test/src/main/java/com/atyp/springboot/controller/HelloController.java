package com.atyp.springboot.controller;

import com.atyp.starter.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午5:37
 * @see: com.atyp.springboot.controller
 * @desception:
 */
@RestController
public class HelloController {

    @Autowired
    HelloService helloService;

    @GetMapping("/hello")
    public String hello(){
        return helloService.sayHellAtyp("HCY");
    }
}
