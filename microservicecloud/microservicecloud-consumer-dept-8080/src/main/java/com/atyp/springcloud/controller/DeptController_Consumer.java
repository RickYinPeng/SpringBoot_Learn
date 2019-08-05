package com.atyp.springcloud.controller;

import com.atguigu.springcloud.entites.Dept;
import com.sun.org.apache.bcel.internal.generic.LSTORE;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午4:58
 * @see: com.atyp.springcloud.controller
 * @desception:
 */
@RestController
public class DeptController_Consumer {

    private static final String REST_URL_PREFIX = "http://localhost:8001";

    /**
     * 使用RestTemplate访问Restful接口非常的简单粗暴无脑。
     * （url，requestMap，ResponseBean.class）
     * 这三个参数分别代表请求地址、请求参数、HTTP响应转换被转换成的对象类型
     */
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add", dept, Boolean.class);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get"+id, Dept.class);
    }

    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list", List.class);
    }

}