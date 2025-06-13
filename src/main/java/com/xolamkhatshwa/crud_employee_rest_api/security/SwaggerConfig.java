package com.xolamkhatshwa.crud_employee_rest_api.security;


import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.enums.SecuritySchemeType;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.security.SecurityScheme;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(info = @Info(title="Employee API", version="v1"), security = @SecurityRequirement(name="basicAuth"))
@SecurityScheme(name="basicAuth", type= SecuritySchemeType.HTTP, scheme = "basic")
public class SwaggerConfig {
}
