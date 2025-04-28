package com.xolamkhatshwa.crud_employee_rest_api.exception;

import lombok.Data;

@Data
public class EmployeeErrorResponse {
    private int status;
    private String message;
    private long timeStamp;
}
