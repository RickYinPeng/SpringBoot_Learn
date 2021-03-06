package com.atyp.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/10 下午3:04
 * @see: com.atyp.springcloud
 * @desception:
 */
@SpringBootApplication
@EnableEurekaServer   // EurekaServer 服务端启动类。接受其他微服务注册进来
public class EurekaServer7003_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7003_App.class,args);
    }
}
