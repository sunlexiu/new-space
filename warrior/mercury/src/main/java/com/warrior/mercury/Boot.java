package com.warrior.mercury;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author:       Charon
 * @create:       2020/6/1 20:55
 */
@SpringBootApplication
@MapperScan("com.warrior.mercury.mapper")
public class Boot {

    public static void main(String[] args) {
        SpringApplication.run(Boot.class, args);
    }
}
