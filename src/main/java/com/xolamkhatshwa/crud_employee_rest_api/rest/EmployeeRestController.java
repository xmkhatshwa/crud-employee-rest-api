package com.xolamkhatshwa.crud_employee_rest_api.rest;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Tag(name = "Author REST API Endpoint", description = "Operations Related to author")
@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    private final Environment env;

    @Autowired
    public EmployeeRestController(Environment env) {
        this.env = env;
    }

    @Operation(summary = "Get all authors", description = "Retrieve a list of all authors")
    @GetMapping("author")
    public String testAPI(){
        return String.format("Names: %s \nEmail: %s",
                env.getProperty("author.name"), env.getProperty("author.email"));
    }
}
