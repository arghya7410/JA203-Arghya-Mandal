import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Player } from '../models/player.model';

@Injectable({
  providedIn: 'root'
})
export class PlayerService {
  private apiUrl = 'http://localhost:8080/api/players';

  constructor(private http: HttpClient) {}

  getAllPlayers(): Observable<Player[]> {
    return this.http.get<Player[]>(this.apiUrl + '/getall');
  }

  getPlayerById(playerId: number): Observable<Player> {
    return this.http.get<Player>(`${this.apiUrl}/getbyid/${playerId}`);
  }

  addPlayer(player: Player): Observable<Player> {
    return this.http.post<Player>(`${this.apiUrl}/add`, player);
  }

  updatePlayer(player: Player): Observable<Player> {
    return this.http.put<Player>(`${this.apiUrl}/update/${player.playerId}`, player);
  }

  deletePlayer(playerId: number): Observable<void> {
    return this.http.delete<void>(`${this.apiUrl}/delete/${playerId}`);
  }
}