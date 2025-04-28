package com.xolamkhatshwa.crud_employee_rest_api.dao;

import com.xolamkhatshwa.crud_employee_rest_api.entity.Role;

public interface RoleDao {
    Role findRoleByName(String roleName);
}
