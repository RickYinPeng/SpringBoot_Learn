package com.atyp.springboot07.listener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午4:34
 * @see: com.atyp.springboot07.listener
 * @desception:
 */
public class HelloSpringApplicationRunlistener implements SpringApplicationRunListener {

    public HelloSpringApplicationRunlistener(SpringApplication application,String[] args) {

    }

    @Override
    public void starting() {
        System.out.println("SpringApplicationRunListener...starting");
    }

    @Override
    public void environmentPrepared(ConfigurableEnvironment environment) {
        Object o = environment.getSystemProperties().get("os.name");
        System.out.println("SpringApplicationRunListener...environmentPrepared.."+o);
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener...contextPrepared");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("SpringApplicationRunListener...contextLoaded");
    }

    @Override
    public void finished(ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("SpringApplicationRunListener...finished");
    }
}
