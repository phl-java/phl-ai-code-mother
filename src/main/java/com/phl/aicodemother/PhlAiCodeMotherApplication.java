package com.phl.aicodemother;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.phl.aicodemother.mapper")
public class PhlAiCodeMotherApplication {

    public static void main(String[] args) {
        SpringApplication.run(PhlAiCodeMotherApplication.class, args);
        System.err.println("启动成功");
    }

}
