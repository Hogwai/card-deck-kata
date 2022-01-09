package com.hogwai.carddeckwebapp.controller;

import com.hogwai.carddeckwebapp.model.Card;
import com.hogwai.carddeckwebapp.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cards/")
@CrossOrigin(origins = "http://localhost:4200")
public class CardController {

    @Autowired
    CardService cardService;

    @GetMapping
    public ResponseEntity<List<Card>> getAllCards() {
        List<Card> cardsFromDB = cardService.getAllCardsFromDB();
        return ResponseEntity.ok(cardsFromDB);
    }

    @GetMapping("/shuffle")
    public ResponseEntity<List<Card>> shuffleAllCards() {
        List<Card> shuffledDeck = cardService.shuffleDeck(cardService.getAllCardsFromDB());
        return ResponseEntity.ok(shuffledDeck);
    }
}
