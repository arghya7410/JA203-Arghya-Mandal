import { Component, OnInit } from '@angular/core';
import { Player } from 'src/app/models/player.model';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-player-list',
  templateUrl: './player-list.component.html',
  styleUrls: ['./player-list.component.css']
})
export class PlayerListComponent implements OnInit {
  players: Player[] = [];

  constructor(private playerService: PlayerService) {}

  ngOnInit(): void {
    this.fetchPlayers();
  }

  fetchPlayers(): void {
    this.playerService.getAllPlayers().subscribe((data) => {
      this.players = data;
    });
  }

  deletePlayer(playerId: number): void {
    this.playerService.deletePlayer(playerId).subscribe(() => {
      this.fetchPlayers();
    });
  }
}