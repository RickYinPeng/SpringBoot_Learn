package com.atyp.springcloud;

import com.atyp.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/08/04 下午5:28
 * @see: com.atyp.springcloud
 * @desception:
 */
@SpringBootApplication
@EnableEurekaClient
//在启动该微服务的时候就能去加载我们自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "MICROSERVICECLOUD-DEPT",configuration = MySelfRule.class)
public class DeptConsumer8080_APP {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8080_APP.class,args);
    }
}
