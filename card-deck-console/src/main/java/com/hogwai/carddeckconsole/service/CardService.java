package com.hogwai.carddeckconsole.service;

import com.hogwai.carddeckconsole.model.Card;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Service
public class CardService {
    private static final Logger LOGGER = LogManager.getLogger(CardService.class);

    public List<Card> populateDeck() {
        List<Card> deck = new ArrayList<>();
        for (Card.Couleur couleur : Card.Couleur.values()){
            for (Card.Valeur valeur : Card.Valeur.values()){
                deck.add(new Card(couleur, valeur));
            }
        }
        return deck;
    }

    public List<Card> shuffleDeck(List<Card> deck) {
        Collections.shuffle(deck);
        return deck;
    }

    public void printCards(List<Card> deck){
        for (Card card : deck){
            LOGGER.info(String.format("%s de %s", card.getValeur(), card.getCouleur()));
        }
    }
}
