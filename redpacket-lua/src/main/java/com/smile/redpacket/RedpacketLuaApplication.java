package com.smile.redpacket;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @author 12780
 */
@EnableAsync
@SpringBootApplication
@MapperScan("com.smile.redpacket.mapper")
public class RedpacketLuaApplication {

    public static void main(String[] args) {
        SpringApplication.run(RedpacketLuaApplication.class, args);
    }

}
