package com.jackie.library.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import io.swagger.v3.oas.annotations.servers.Server;

@OpenAPIDefinition(
        info = @Info(
                contact = @Contact(
                        name="Viet An Nguyen",
                        email = "23560092@gm.uit.edu.vn",
                        url="https://springdoc.org/"
                ),
                description = "OpenApi documentation for Spring Boot",
                title="Library OpenApi",
                version = "1.0",
                license = @License(
                        name = "License name",
                        url = "https://springdoc.org/"
                ),
                termsOfService = "Terms of service"
        ),
        servers = {
                @Server(
                        description = "Local Env",
                        url = "http://localhost:8080"
                ),
                @Server(
                        description = "PROD Env",
                        url = "https://demo-adapted-ver2.vercel.app"
                )
        }
)
public class OpenApiConfig {

}