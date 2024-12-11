import { Component, OnInit } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';
import { Player } from 'src/app/models/player.model';
import { PlayerService } from 'src/app/services/player.service';

@Component({
  selector: 'app-player-edit',
  templateUrl: './player-edit.component.html',
  styleUrls: ['./player-edit.component.css']
})
export class PlayerEditComponent implements OnInit {
  player: Player = {
    playerId: 0,
    playerName: '',
    jerseyNumber: 0,
    role: '',
    totalMatches: 0,
    teamName: '',
    countryName: '',
    description: ''
  };

  constructor(
    private playerService: PlayerService,
    private route: ActivatedRoute,
    private router: Router
  ) {}

  ngOnInit(): void {
    const playerId = +this.route.snapshot.paramMap.get('playerId')!;
    this.playerService.getPlayerById(playerId).subscribe((data) => {
      this.player = data;
    });
  }

  updatePlayer(): void {
    this.playerService.updatePlayer(this.player).subscribe(() => {
      this.router.navigate(['/']);
    });
  }
}
