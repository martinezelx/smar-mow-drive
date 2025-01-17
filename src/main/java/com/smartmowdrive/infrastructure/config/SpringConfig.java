package com.smartmowdrive.infrastructure.config;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfig {

  @Bean
  public OpenAPI customOpenAPI() {
    return new OpenAPI()
        .info(
            new Info()
                .title("SMART Mow Drive API")
                .version("1.5.0")
                .description("API for Mobility SEAT:CODE Backend Code Challenge.")
                .contact(
                    new Contact()
                        .name("Luis Muñoz Martínez")
                        .email("martinezelx@gmail.com")
                        .url("https://github.com/martinezelx")));
  }
}
