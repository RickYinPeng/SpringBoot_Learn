package com.atyp.springboot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author RickYinPeng
 * @ClassName HelloController
 * @Description
 * @date 2019/6/30/20:27
 */
/*@Controller
@ResponseBody*/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello world quick";
    }
}
