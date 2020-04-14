package com.crud.tasks.mapper;

import com.crud.tasks.domain.*;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TrelloBasicMapperTestSuite {

    @Autowired
    private TrelloMapper trelloMapper;

    @Test
    public void mapToBoardsTest() {
        // Given
        List<TrelloBoardDto> trelloBoardsDto = new ArrayList<>();
        TrelloBoardDto trelloBoardDto = new TrelloBoardDto("1","name",new ArrayList<>());
        TrelloBoardDto trelloBoardDto2 = new TrelloBoardDto("2","name2",new ArrayList<>());
        TrelloBoardDto trelloBoardDto3 = new TrelloBoardDto("3","name3",new ArrayList<>());

        trelloBoardsDto.add(trelloBoardDto);
        trelloBoardsDto.add(trelloBoardDto2);
        trelloBoardsDto.add(trelloBoardDto3);

        List<TrelloBoard> trelloBoardsToCompare = new ArrayList<>();
        trelloBoardsToCompare.add(new TrelloBoard("1", "name", new ArrayList<>()));
        trelloBoardsToCompare.add(new TrelloBoard("2", "name2", new ArrayList<>()));
        trelloBoardsToCompare.add(new TrelloBoard("3", "name3", new ArrayList<>()));

        // When
        List<TrelloBoard> trelloBoards = trelloMapper.mapToBoards(trelloBoardsDto);

        // Then
        assertEquals(trelloBoardsToCompare.get(1).getClass(), trelloBoards.get(1).getClass());
    }

    @Test
    public void mapToBoardsDtoTest() {
        // Given
        List<TrelloBoard> trelloBoards = new ArrayList<>();
        TrelloBoard trelloBoard = new TrelloBoard("1","name",new ArrayList<>());
        TrelloBoard trelloBoard2 = new TrelloBoard("2","name2",new ArrayList<>());
        TrelloBoard trelloBoard3 = new TrelloBoard("3","name3",new ArrayList<>());

        trelloBoards.add(trelloBoard);
        trelloBoards.add(trelloBoard2);
        trelloBoards.add(trelloBoard3);

        List<TrelloBoardDto> trelloBoardsDtoToCompare = new ArrayList<>();
        trelloBoardsDtoToCompare.add(new TrelloBoardDto("1","name",new ArrayList<>()));
        trelloBoardsDtoToCompare.add(new TrelloBoardDto("2","name2",new ArrayList<>()));
        trelloBoardsDtoToCompare.add(new TrelloBoardDto("3","name3",new ArrayList<>()));

        // When
        List<TrelloBoardDto> trelloBoardsDto = trelloMapper.mapToBoardsDto(trelloBoards);

        // Then
        assertEquals(trelloBoardsDtoToCompare.get(1).getClass(), trelloBoardsDto.get(1).getClass());
    }

    @Test
    public void mapToListTest() {
        // Given
        List<TrelloListDto> trelloListsDto = new ArrayList<>();
        TrelloListDto trelloList = new TrelloListDto("1","name",true);
        TrelloListDto trelloList2 = new TrelloListDto("2","name2",true);
        TrelloListDto trelloList3 = new TrelloListDto("3","name3",true);

        trelloListsDto.add(trelloList);
        trelloListsDto.add(trelloList2);
        trelloListsDto.add(trelloList3);

        List<TrelloList> trelloListToCompare = new ArrayList<>();
        trelloListToCompare.add(new TrelloList("1","name",true));
        trelloListToCompare.add(new TrelloList("2","name2",true));
        trelloListToCompare.add(new TrelloList("3","name3",true));

        // When
        List<TrelloList> trelloLists = trelloMapper.mapToList(trelloListsDto);

        // Then
        assertEquals(trelloListToCompare.get(1).getClass(), trelloLists.get(1).getClass());
    }

    @Test
    public void mapToListDtoTest() {
        // Given
        List<TrelloList> trelloLists = new ArrayList<>();
        TrelloList trelloList = new TrelloList("1","name",true);
        TrelloList trelloList2 = new TrelloList("2","name2",true);
        TrelloList trelloList3 = new TrelloList("3","name3",true);


        trelloLists.add(trelloList);
        trelloLists.add(trelloList2);
        trelloLists.add(trelloList3);

        List<TrelloListDto> trelloListDtosToCompare = new ArrayList<>();
        trelloListDtosToCompare.add(new TrelloListDto("1","name",true));
        trelloListDtosToCompare.add(new TrelloListDto("2","name2",true));
        trelloListDtosToCompare.add(new TrelloListDto("3","name3",true));

        // When
        List<TrelloListDto> trelloListDtos = trelloMapper.mapToListDto(trelloLists);

        // Then
        assertEquals(trelloListDtosToCompare.get(1).getClass(),trelloListDtos.get(1).getClass());
    }

    @Test
    public void mapToCardDtoTest() {
        // Given
        TrelloCard trelloCard = new TrelloCard("name", "description", "pos", "listId");

        // When
        TrelloCardDto trelloCardDto = trelloMapper.mapToCardDto(trelloCard);
        TrelloCardDto trelloCardDtoToCompare = new TrelloCardDto("name", "description", "pos", "listId");

        // Then
        assertEquals(trelloCardDtoToCompare.getClass(), trelloCardDto.getClass());
    }

    @Test
    public void mapToCardTest() {
        // Given
        TrelloCardDto trelloCardDto = new TrelloCardDto("name", "description", "pos", "listId");

        // When
        TrelloCard trelloCard = trelloMapper.mapToCard(trelloCardDto);
        TrelloCard trelloCardToCompare = new TrelloCard("name", "description", "pos", "listId");

        // Then
        assertEquals(trelloCardToCompare.getClass(), trelloCard.getClass());
    }
}