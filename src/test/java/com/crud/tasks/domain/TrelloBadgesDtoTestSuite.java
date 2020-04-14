package com.crud.tasks.domain;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloBadgesDtoTestSuite {
    @Test
    public void getValuesTest() {
        // Given
        TrelloBadgesDto trelloBadgesDto = new TrelloBadgesDto(1, new TrelloAttachmentsByTypeDto(new TrelloTrelloDto(1, 3)));

        // When
        int votes = trelloBadgesDto.getVotes();
        int board = trelloBadgesDto.getAttachmentsByTypeDto().getTrelloTrelloDto().getBoard();
        int card = trelloBadgesDto.getAttachmentsByTypeDto().getTrelloTrelloDto().getCard();

        // Then
        assertEquals(1, votes);
        assertEquals(1, board);
        assertEquals(3, card);
    }

}