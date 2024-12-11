import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { Player } from 'src/app/models/player.model';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-player-add',
  templateUrl: './player-add.component.html',
  styleUrls: ['./player-add.component.css']
})
export class PlayerAddComponent {
  player: Player = {
    playerName: '',
    jerseyNumber: 0,
    role: '',
    totalMatches: 0,
    teamName: '',
    countryName: '',
    description: ''
  };

  constructor(private playerService: PlayerService, private router: Router) {}

  addPlayer(): void {
    this.playerService.addPlayer(this.player).subscribe(() => {
      this.router.navigate(['/']);
    });
  }
}
