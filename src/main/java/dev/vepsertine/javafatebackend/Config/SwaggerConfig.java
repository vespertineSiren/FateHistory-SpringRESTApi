package dev.vepsertine.javafatebackend.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfig {
    @Bean
    public Docket api(){
        return new Docket(DocumentationType.SWAGGER_2).select()
                .apis(RequestHandlerSelectors
                        .basePackage("dev.vespertine.javafatebackend"))
                .paths(PathSelectors.regex("/.*"))
                .build().apiInfo(apiEndPointsInfo());
    }

    private ApiInfo apiEndPointsInfo(){
        return new ApiInfoBuilder().title("Java Fate Backend")
                .description("Java Fatebackend using MySQL project week 3/8")
                .contact(new Contact("Patrick Martin", "http://www.lambdaschool.com", "patrickmartin88@gmail.com"))
                .license("MIT")
                .licenseUrl("https://github.com/vespertineSiren/FateHistory-SpringRESTApi/blob/master/LICENSE")
                .version("1.0.0")
                .build();
    }
}
