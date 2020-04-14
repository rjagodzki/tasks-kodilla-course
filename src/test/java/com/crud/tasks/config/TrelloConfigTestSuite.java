package com.crud.tasks.config;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloConfigTestSuite {

    @Autowired
    private TrelloConfig trelloConfig;

    @Test
    public void getTrelloApiEndpoint() {
        // Given
        String trelloApiEndpoint = trelloConfig.getTrelloApiEndpoint();

        // When
        String trelloApiEndpointToCompare = "https://api.trello.com/1";

        // Then
        assertEquals(trelloApiEndpoint, trelloApiEndpoint);
    }

    @Test
    public void getTrelloAppKey() {
        // Given
        String trelloAppKey = trelloConfig.getTrelloAppKey();

        // When
        String trelloAppKeyToCompare = "7b6e3dfa54a8373003971729f1c0817e";

        // Then
        assertEquals(trelloAppKeyToCompare, trelloAppKey);
    }

    @Test
    public void getTrelloToken() {
        // Given
        String trelloToken = trelloConfig.getTrelloToken();

        // When
        String trelloTokenToCompare = "86ec641deeaa88f90c8b0ba70a9fba8c8a216731eee05a0381689455e46a7b89";

        // Then
        assertEquals(trelloTokenToCompare, trelloToken);
    }

    @Test
    public void getTrelloUsername() {
        // Given
        String trelloName = trelloConfig.getTrelloUsername();

        // When
        String trelloNameToCompare = "radekjagodzki";

        // Then
        assertEquals(trelloNameToCompare, trelloName);
    }
}