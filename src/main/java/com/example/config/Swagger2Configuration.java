package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@Configuration
public class Swagger2Configuration {

    // Swagger实例Bean是Docket，所以通过配置Docket实例来配置Swaggger。
    // （自己的项目访问路径/swagger-ui.html）来访问接口文档就可以了
    @Bean
    public Docket docket(){
       return new Docket(DocumentationType.SWAGGER_2);
    }
}
