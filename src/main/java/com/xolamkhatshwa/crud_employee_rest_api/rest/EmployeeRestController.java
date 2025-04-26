package com.xolamkhatshwa.crud_employee_rest_api.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class EmployeeRestController {

    @GetMapping("test")
    public String testAPI(){
        return "API is running...";
    }
}
