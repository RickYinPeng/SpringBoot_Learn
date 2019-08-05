package com.atyp.springboot07.listener;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午4:38
 * @see: com.atyp.springboot07.listener
 * @desception:
 */
@Component
public class HelloApplicationRunner implements ApplicationRunner {
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner...run"+ Arrays.asList(args));
    }
}
