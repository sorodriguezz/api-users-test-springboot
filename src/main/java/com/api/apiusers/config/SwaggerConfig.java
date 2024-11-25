package com.api.apiusers.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.security.SecurityRequirement;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {
    @Bean
    GroupedOpenApi publicApi() {
        return GroupedOpenApi.builder().group("public-apis").pathsToMatch("/**").build();
    }

    @Bean
    OpenAPI customOpenAPI() {
        return new OpenAPI()
                .info(new Info().title("API Users").version("1.0"))
                .addSecurityItem(new SecurityRequirement().addList("bearerAuth"));
//                .components();
    }
}
