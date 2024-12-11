import { Component } from '@angular/core';
import { ActivatedRoute, Router } from '@angular/router';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent {
  username ="";
  password="";
  constructor(private route:ActivatedRoute, private router:Router){
    this.route.params.subscribe(params => {
      this.username = params['username'];
      this.password = params['password'];
    })
  }
  goToHome(){
    this.router.navigate(['home']);
  }
}
