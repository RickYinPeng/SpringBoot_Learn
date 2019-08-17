package com.atyp.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午4:34
 * @see: com.atyp.springcloud.cfgbeans
 * @desception:
 */
@Configuration
public class configBean {
    @Bean
    @LoadBalanced //Ribbon
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
