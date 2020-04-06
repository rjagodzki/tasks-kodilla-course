package com.crud.tasks.trello.mapper;

import com.crud.tasks.domain.*;
import com.crud.tasks.mapper.TrelloMapper;
import com.crud.tasks.trello.facade.TrelloFacade;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloMapperTestSuite {
    @Autowired
    private TrelloMapper trelloMapper;

    @Test
    public void mapToBoardsDtoAndMapToListDtoTest() {
        // Given
        TrelloList trelloList1 = new TrelloList("1", "trelloList1", false);
        TrelloList trelloList2 = new TrelloList("2", "trelloList2", true);
        TrelloList trelloList3 = new TrelloList("3", "trelloList3", false);

        List<TrelloList> tlList =  new ArrayList<>();
        tlList.add(trelloList1);
        tlList.add(trelloList2);
        tlList.add(trelloList3);

        TrelloBoard trelloBoard = new TrelloBoard("1", "trelloBoard", tlList);

        List<TrelloBoard> tbList = new ArrayList<>();
        tbList.add(trelloBoard);

        // When
        trelloMapper.mapToBoardsDto(tbList);

        // Then
        Assert.assertEquals(1, tbList.size());
    }

    @Test
    public void mapToBoardsAndMapToListTest() {
        // Given
        TrelloListDto trelloListDto1 = new TrelloListDto("1", "trelloListDto1", false);
        TrelloListDto trelloListDto2 = new TrelloListDto("2", "trelloListDto2", true);
        TrelloListDto trelloListDto3 = new TrelloListDto("3", "trelloListDto3", false);

        List<TrelloListDto> tlList =  new ArrayList<>();
        tlList.add(trelloListDto1);
        tlList.add(trelloListDto2);
        tlList.add(trelloListDto3);

        TrelloBoardDto trelloBoard = new TrelloBoardDto("1", "trelloBoard", tlList);

        List<TrelloBoardDto> tbList = new ArrayList<>();
        tbList.add(trelloBoard);

        // When
        trelloMapper.mapToBoards(tbList);

        // Then
        Assert.assertEquals(1, tbList.size());
    }

    @Test
    public void mapToCardDtoTest() {
        // Given
        TrelloCard trelloCard = new TrelloCard("Card","description", "postion1", "1");
        TrelloCardDto trelloCardToCompare = new TrelloCardDto("Card","description", "postion1", "1");

        // When

        TrelloCardDto trelloCardAfterMapping = trelloMapper.mapToCardDto(trelloCard);

        // Then
        Assert.assertEquals(trelloCardToCompare.getClass(), trelloCardAfterMapping.getClass());
    }

    @Test
    public void mapToCardTest() {
        // Given
        TrelloCard trelloCardToCompare = new TrelloCard("Card","description", "postion1", "1");
        TrelloCardDto trelloCard = new TrelloCardDto("Card","description", "postion1", "1");

        // When

        TrelloCard trelloCardAfterMapping = trelloMapper.mapToCard(trelloCard);

        // Then
        Assert.assertEquals(trelloCardToCompare.getClass(), trelloCardAfterMapping.getClass());
    }
}
