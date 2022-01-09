package com.hogwai.carddeckconsole;

import com.hogwai.carddeckconsole.model.Card;
import com.hogwai.carddeckconsole.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardDeckConsoleRunner implements CommandLineRunner {

    @Autowired
    private CardService cardService;

    @Override
    public void run(String... args) throws Exception {
        List<Card> deck = cardService.populateDeck();
        cardService.printCards(deck);
    }
}
