import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service'
import { Card } from '../card';

/**
 * Card component
 */
@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  /**
   * cards array
   */
  cards: Card[] = [];

  /**
   * Constructor
   */
  constructor(private cardService: CardService) { }

  /**
   * Retrieve all cards on init
   */
  ngOnInit(): void {
    this.getAllCards();
  }

  /**
   * Get all cards
   */
  getAllCards(){
    this.cardService.getCards().subscribe((data: Card[]) => {
      console.log(data);
      this.cards = data;
    });
  }

  /**
   * Get all cards but shuffled
   */
  shuffleAllCards(){
    this.cardService.shuffleCards().subscribe((data: Card[]) => {
      console.log(data);
      this.cards = data;
    });
  }
}