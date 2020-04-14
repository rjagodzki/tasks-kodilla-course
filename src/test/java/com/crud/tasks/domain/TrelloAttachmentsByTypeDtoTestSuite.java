package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;
@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloAttachmentsByTypeDtoTestSuite {

    @Test
    public void getTrelloTrelloDtoTest() {
        // Given
        TrelloAttachmentsByTypeDto trelloAttachmentsByTypeDto = new TrelloAttachmentsByTypeDto(new TrelloTrelloDto(1,3));

        // When
        int board = trelloAttachmentsByTypeDto.getTrelloTrelloDto().getBoard();
        int card = trelloAttachmentsByTypeDto.getTrelloTrelloDto().getCard();

        // Then
        assertEquals(1,board);
        assertEquals(3,card);
    }
}