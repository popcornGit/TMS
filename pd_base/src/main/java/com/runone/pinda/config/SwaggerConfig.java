package com.runone.pinda.config;

import io.swagger.annotations.Api;
import org.apache.coyote.Request;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * Swagger相关配置类
 */
@Configuration
@EnableSwagger2  // 开启Swagger文档功能
public class SwaggerConfig {
    // 定义分割符
    private static final String splitor = ";";

    public Docket createRestApi(){
        // 文档类型
        return new Docket(DocumentationType.SWAGGER_2)
                // 创建api的基本信息
                .apiInfo(apiInfo())
                // 选择哪些接口去暴露
                .select()
                // 扫描的包
                .apis(RequestHandlerSelectors.basePackage("com.runone.pinda.controller"))
                .paths(PathSelectors.any())
                .build();
    }

    private ApiInfo apiInfo(){
        return new ApiInfoBuilder()
                .title("品达物流管理后台基础数据--Swagger文档")
                .version("1.0")
                .build();
    }
}
