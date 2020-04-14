package com.crud.tasks.service;

import com.crud.tasks.domain.TrelloBoard;
import com.crud.tasks.domain.TrelloBoardDto;
import com.crud.tasks.trello.client.TrelloClient;
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
public class TrelloServiceTestSuite {

    @Autowired
    private TrelloService trelloService;

    @Autowired
    private TrelloClient trelloClient;

    @Test
    public void shouldFetchTrelloBoards() {
        // Given
        List<TrelloBoardDto> trelloBoardDtoList = new ArrayList<>();
        trelloBoardDtoList.add(new TrelloBoardDto("1","name", new ArrayList<>()));
        trelloBoardDtoList.add(new TrelloBoardDto("2","name2", new ArrayList<>()));

        List<TrelloBoard> trelloBoards = new ArrayList<>();
        trelloBoards.add(new TrelloBoard("1", "name", new ArrayList<>()));
        trelloBoards.add(new TrelloBoard("2", "name2", new ArrayList<>()));

        // When

        List<TrelloBoardDto> trelloBoardsToCompare = trelloService.fetchTrelloBoards();
    }

}