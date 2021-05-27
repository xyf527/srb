package com.xyf.srb.base.config;
/*
@author XYF
@date 2021/5/7- 12:25     
*/

import com.google.common.base.Predicates;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.function.Predicate;

@Configuration
@EnableSwagger2
public class Swagger2Config {

    @Bean
    public Docket adminConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("adminApi")
                .apiInfo(adminApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/admin/.*")))
                .build();
    }

    private ApiInfo adminApiInfo(){
        return new ApiInfoBuilder()
                .title("尚融宝后台管理系统API文档")
                .description("本文档描述了尚融宝后台管理系统的各个模块的接口的调用方式")
                .version("1.6")
                .contact(new Contact("XYF","1075424378@qq.com","1075424378@qq.com"))
        .build();
    }

    @Bean
    public Docket webConfig(){

        return new Docket(DocumentationType.SWAGGER_2)
                .groupName("webApi")
                .apiInfo(webApiInfo())
                .select()
                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
                .build();
    }

    private ApiInfo webApiInfo(){
        return new ApiInfoBuilder()
                .title("尚融宝网站API文档")
                .description("本文档描述了尚融宝网站的各个模块的接口的调用方式")
                .version("1.6")
                .contact(new Contact("XYF","1075424378@qq.com","1075424378@qq.com"))
                .build();
    }

//    @Bean
//    public Docket apiConfig(){
//
//        return new Docket(DocumentationType.SWAGGER_2)
//                .groupName("api")
//                .apiInfo(apiInfo())
//                .select()
//                //只显示admin路径下的页面
//                .paths(Predicates.and(PathSelectors.regex("/api/.*")))
//                .build();
//
//    }

//    private ApiInfo apiInfo(){
//
//        return new ApiInfoBuilder()
//                .title("尚融宝-API文档")
//                .description("本文档描述了尚融宝接口")
//                .version("1.0")
//                .contact(new Contact("Helen", "http://atguigu.com", "55317332@qq.com"))
//                .build();
//    }


}
