package com.errorscentral.guiabolso.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.service.VendorExtension;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;
import java.util.ArrayList;
import java.util.List;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket apiDocket() {

        Contact contact = new Contact(
                "SQUAD 4",
                "",
                ""
        );

        List<VendorExtension> vendorExtensions = new ArrayList<>();

        ApiInfo apiInfo = new ApiInfo(
                "Errors Central Documentation",
                "RestFull Web Service endpoints", "1.0",
                "", contact,
                "Apache 2.0", "http://www.apache.org/licenses/LICENSE-2.0", vendorExtensions);

        Docket docket = new Docket(DocumentationType.SWAGGER_2)
                .apiInfo(apiInfo)
                .select()
                .apis(RequestHandlerSelectors.basePackage("com.errorscentral.guiabolso"))
                .paths(PathSelectors.any())
                .build();

        return docket;
    }
}
