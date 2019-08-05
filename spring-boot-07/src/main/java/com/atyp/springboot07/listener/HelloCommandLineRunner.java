package com.atyp.springboot07.listener;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author: RickYin
 * @version: 1.0
 * @createDate: 2019/07/28 下午4:39
 * @see: com.atyp.springboot07.listener
 * @desception:
 */
@Component
public class HelloCommandLineRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner...run");
    }
}
