import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Card } from './card';

/**
 * Service responsible for handling cards retrieving
 */
@Injectable({
  providedIn: 'root'
})
export class CardService {

  /**
   * base backend url
   */
  private baseUrl = "http://localhost:8081/cards/";

  /**
   * Constructor
   * @param {HttpClient} http
   */
  constructor(private http: HttpClient) { }

  /**
   * Get all cards from the backend
   * @returns all cards
   */
  getCards(): Observable<Card[]>{
    return this.http.get<Card[]>(`${this.baseUrl}`);
  }

  /**
   * Get all shuffled cards 
   * @returns all cards but shuffled
   */
  shuffleCards(): Observable<Card[]>{
    return this.http.get<Card[]>(`${this.baseUrl}shuffle`);
  }
  
}