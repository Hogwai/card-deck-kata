import { Component, OnInit } from '@angular/core';
import { CardService } from '../card.service'
import { Card } from '../card';

@Component({
  selector: 'app-card',
  templateUrl: './card.component.html',
  styleUrls: ['./card.component.css']
})
export class CardComponent implements OnInit {

  cards: Card[] = [];
  constructor(private cardService: CardService) { }

  ngOnInit(): void {
    this.getAllCards();
  }

  getAllCards(){
    this.cardService.getCards().subscribe((data: Card[]) => {
      console.log(data);
      this.cards = data;
    });
  }

  shuffleAllCards(){
    this.cardService.shuffleCards().subscribe((data: Card[]) => {
      console.log(data);
      this.cards = data;
    });
  }
}