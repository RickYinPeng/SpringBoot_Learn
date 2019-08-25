package com.atyp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午5:28
 * @see: com.atyp.springcloud
 * @desception:
 */
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.atyp.springcloud"})
public class DeptConsumer8080_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8080_APP.class,args);
    }
}
