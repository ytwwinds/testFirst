package com.jiayi.goods;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@MapperScan("com.jiayi.goods.mapper")
@SpringBootApplication
public class CargoCubeGoodsApplication {

    public static void main(String[] args) {
        SpringApplication.run(CargoCubeGoodsApplication.class, args);
    }
}
