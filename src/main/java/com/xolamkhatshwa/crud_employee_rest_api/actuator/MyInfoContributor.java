package com.xolamkhatshwa.crud_employee_rest_api.actuator;

import org.springframework.boot.actuate.info.Info;
import org.springframework.boot.actuate.info.InfoContributor;
import org.springframework.stereotype.Component;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

@Component
public class MyInfoContributor implements InfoContributor {
    @Override
    public void contribute(Info.Builder builder) {
        Map<String, String> authorDetails = new HashMap<>();
        authorDetails.put("name", "Xola Mkhatshwa");
        authorDetails.put("email", "mkhatshwa.xola@gmail.com");

        builder.withDetail("Author", authorDetails);

    }
}
