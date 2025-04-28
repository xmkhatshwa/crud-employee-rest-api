package com.xolamkhatshwa.crud_employee_rest_api.dao;

import com.xolamkhatshwa.crud_employee_rest_api.entity.User;

public interface UserDao {
    User findByUserName(String username);
}
