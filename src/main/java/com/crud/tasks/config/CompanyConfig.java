package com.crud.tasks.config;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
@Getter
public class CompanyConfig {
    @Value("${info.app.company.name}")
    private String companyName;

    @Value("${info.app.company.goal}")
    private String companyGoal;

    @Value("${info.app.company.email}")
    private String companyEmail;

    @Value("${info.app.company.phone}")
    private String companyPhone;
}
