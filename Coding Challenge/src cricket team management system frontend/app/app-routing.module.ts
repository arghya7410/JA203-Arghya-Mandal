import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { PlayerAddComponent } from './components/player-add/player-add.component';
import { PlayerEditComponent } from './components/player-edit/player-edit.component';
import { PlayerListComponent } from './components/player-list/player-list.component';

const routes: Routes = [
  { path: '', component: PlayerListComponent },
  { path: 'add', component: PlayerAddComponent },
  { path: 'edit/:playerId', component: PlayerEditComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
