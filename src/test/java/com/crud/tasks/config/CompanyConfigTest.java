package com.crud.tasks.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyConfigTest {

    @Autowired
    private CompanyConfig companyConfig;

    @Test
    public void getAllValues() {
        // Given && When
        String ownerName = companyConfig.getOwnerName();
        String ownerSurname = companyConfig.getOwnerSurname();
        String companyName = companyConfig.getCompanyName();
        String companyGoal = companyConfig.getCompanyGoal();
        String companyEmail = companyConfig.getCompanyEmail();
        String companyPhone = companyConfig.getCompanyPhone();

        String ownerNameToCompare = "John";
        String ownerSurnameToCompare = "Doe";
        String companyNameToCompare = "TaskCrudAppCreator";
        String companyGoalToCompare = "Our goal is to make the world a better place!";
        String companyEmailToCompare = "tasks@crud.com";
        String companyPhoneToCompare = "744489230";

        // Then
        assertEquals(ownerNameToCompare, ownerName);
        assertEquals(ownerSurname, ownerSurnameToCompare);
        assertEquals(companyNameToCompare, companyName);
        assertEquals(companyGoalToCompare, companyGoal);
        assertEquals(companyEmailToCompare, companyEmail);
        assertEquals(companyPhoneToCompare, companyPhone);
    }
}