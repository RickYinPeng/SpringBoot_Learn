package com.atyp.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

import java.util.concurrent.CountDownLatch;

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

    @Bean
    public IRule myRule(){
        /**
         * 目的：用我们重新选择的随机算法替代默认的轮询
         */
        return new RetryRule();
    }
}
