import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  name = 'arghya mandal';
  city = 'Pune';
  imgUrl = '../assets/angular logo.png';
  course = 'Angular';
  number = 10;
  fractionNumber = 69.42069;
  currentDate = new Date();
  price = 104999.99;
  array = [1,2,3,4,5];
  color: string = 'red';
  dynamicStyles = {
    'color': this.color,
    'fontSize': '20px'
  }
  display(){
    this.name = 'Sahil'
  }
  count = 1;
}
