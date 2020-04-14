package com.crud.tasks.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AdminConfigTestSuite {

    @Autowired
    private AdminConfig adminConfig;

    @Test
    public void getAdminMail() {
        // Given
        String adminMail = adminConfig.getAdminMail();

        // When
        String adminMailToCompare = "jagodzki.radek@gmail.com";

        // Then
        assertEquals(adminMailToCompare, adminMail);
    }

    @Test
    public void getAdminName() {
        // Given
        String adminName = adminConfig.getAdminName();

        // When
        String adminNameToCompare = "Kodilla User";

        // Then
        assertEquals(adminNameToCompare, adminName);
    }
}