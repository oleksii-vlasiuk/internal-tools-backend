package com.oleksiivlasiuk.internaltools.config;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(
        info = @Info(
                title = "Internal Tools API",
                version = "1.0",
                description = "Lightweight internal management system"
        )
)
public class OpenApiConfig {
}
