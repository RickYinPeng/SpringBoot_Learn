package com.atyp.springboot04.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/21 上午11:53
 * @see: com.atyp.springboot04.controller
 * @desception:
 */
@Controller
public class HelloController {

    @GetMapping("/abc")
    public String hello(Model model){
        model.addAttribute("msg", "你好");
        return "success";
    }
}
