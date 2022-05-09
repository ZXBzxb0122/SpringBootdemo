package com.example.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
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
       return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo())
                .select()
                //通过.select()方法，去配置扫描接口,RequestHandlerSelectors配置如何扫描接口
                .apis(RequestHandlerSelectors.basePackage("com.example.Controller"))
                .build();
    }

    // API 文档的详细信息函数
    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("网上商城API接口文档")
                // 创建人
                .contact(new Contact("zxb","","2226933943@qq.com"))
                .version("v1.0")
                .description("网上商城API描述")
                .license("许可标准")
                .licenseUrl("许可标准URL")
                .build();


    }
}
