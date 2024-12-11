import { Component, OnInit } from '@angular/core';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'webapp';
  parentData: string = 'Hello from Parent!';

  messageFromChild: string = '';
  handleNotification(message: string) {
    this.messageFromChild = message;
  }
}
