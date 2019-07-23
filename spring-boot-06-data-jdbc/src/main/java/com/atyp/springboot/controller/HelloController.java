package com.atyp.springboot.controller;

import com.alibaba.druid.support.http.StatViewServlet;
import com.alibaba.druid.support.http.WebStatFilter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/23 下午7:49
 * @see: com.atyp.springboot.controller
 * @desception:
 */
@Controller
public class HelloController {

    @Autowired
    JdbcTemplate jdbcTemplate;


    @ResponseBody
    @RequestMapping("/query")
    public Map<String,Object> map(){
        List<Map<String, Object>> list =
                jdbcTemplate.queryForList("select * from department");
        System.out.println(list.size());
        return list.get(0);
    }

    //配置Druid监控
    //1.配置一个管理后台的Servlet
    @Bean
    public ServletRegistrationBean statViewServlet(){
        ServletRegistrationBean bean = new ServletRegistrationBean(new StatViewServlet(), "/druid/*");
        Map<String,String> initParams = new HashMap<>();
        initParams.put("loginUsername", "admin");
        initParams.put("loginPassword", "123456");
        initParams.put("allow", "");//不写就代表允许所有访问

        bean.setInitParameters(initParams);

        return bean;
    }
    //2.配置一个web监控的filter
    @Bean
    public FilterRegistrationBean webStatFilter(){
        FilterRegistrationBean bean = new FilterRegistrationBean();
        bean.setFilter(new WebStatFilter());
        Map<String,String> initParams = new HashMap<>();
        initParams.put("exclusions", "*.js,*.css,/druid/*");
        bean.setInitParameters(initParams);
        bean.setUrlPatterns(Arrays.asList("/*"));
        return bean;
    }
}
