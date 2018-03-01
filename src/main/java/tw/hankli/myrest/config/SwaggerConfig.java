package tw.hankli.myrest.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    private static final String GROUP_NAME = "行動解決方案部";
    private static final String BASE_PACKAGE = "tw.hankli.myrest.controllers";
    private static final String TITLE = "My REST";
    private static final String DESCRIPTION = "Demo RESTful";
    private static final String VERSION = "1.0";

    @Bean
    public Docket api() {

        return new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(new ApiInfoBuilder()
                        .title(TITLE)
                        .description(DESCRIPTION)
                        .version(VERSION)
                        .build())
                .groupName(GROUP_NAME)
                .select()
                .apis(RequestHandlerSelectors.basePackage(BASE_PACKAGE))
                .paths(PathSelectors.any())
                .build();
    }
}
