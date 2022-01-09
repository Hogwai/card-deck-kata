package com.hogwai.carddeckwebapp;

import com.hogwai.carddeckwebapp.model.Card;
import com.hogwai.carddeckwebapp.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardDeckWebAppRunner implements CommandLineRunner {

    @Autowired
    private CardService cardService;

    @Override
    public void run(String... args) throws Exception {
        List<Card> deck = cardService.populateDeck();
        cardService.persistCards(deck);
    }
}
