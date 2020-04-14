package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloTrelloDtoTestSuite {

    @Test
    public void getBoardAndGetCardTest() {
        // Given
        TrelloTrelloDto trelloTrelloDto = new TrelloTrelloDto(1, 2);

        // When
        int board = 1;
        int card = 2;

        // Then
        assertEquals(board, trelloTrelloDto.getBoard());
        assertEquals(card, trelloTrelloDto.getCard());
    }
}