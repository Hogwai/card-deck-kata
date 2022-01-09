package com.hogwai.carddeckpersistence;

import com.hogwai.carddeckpersistence.model.Card;
import com.hogwai.carddeckpersistence.service.CardService;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class CardDeckPersistenceApplicationTests {

	@Autowired
	CardService cardService;

	/**
	 * Deletes records after each test
	 */
	@BeforeEach
	void deleteCardsFromDB(){
		cardService.deleteCardsFromDb();
	}

	/**
	 * Test if the number of cards in DB is correct
	 */
	@Test
	void testNumberOfCardsInDB() {
		List<Card> deck = cardService.populateDeck();
		cardService.persistCards(deck);

		Assertions.assertEquals(deck.size(), (long) cardService.getAllCardsFromDB().size());
	}

	/**
	 * Tests if all cards generated have been correctly inserted
	 */
	@Test
	void testAllCardsInDB() {
		List<Card> deck = cardService.populateDeck();
		cardService.persistCards(deck);
		List<Card> deckFromDB = cardService.getAllCardsFromDB();

		for (int i = 0; i < deck.size(); i++) {
			assertEquals(deck.get(i), deckFromDB.get(i));
		}
	}

}
