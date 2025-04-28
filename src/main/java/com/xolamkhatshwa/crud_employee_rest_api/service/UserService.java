package com.xolamkhatshwa.crud_employee_rest_api.service;

import com.xolamkhatshwa.crud_employee_rest_api.entity.User;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface UserService extends UserDetailsService {

    public User findByUserName(String userName);

}