package com.hogwai.carddeckpersistence;

import com.hogwai.carddeckpersistence.model.Card;
import com.hogwai.carddeckpersistence.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CardDeckPersistenceRunner implements CommandLineRunner {

    @Autowired
    private CardService cardService;

    @Override
    public void run(String... args) throws Exception {
        List<Card> deck = cardService.populateDeck();
        cardService.persistCards(deck);
        List<Card> deckFromDB = cardService.getAllCardsFromDB();
        cardService.printCards(deckFromDB);
    }
}
