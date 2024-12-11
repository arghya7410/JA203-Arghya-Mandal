import { Component, EventEmitter, Input, Output } from '@angular/core';

@Component({
  selector: 'app-child',
  templateUrl: './child.component.html',
  styleUrls: ['./child.component.css']
})
export class ChildComponent {
  @Input()
  childData!: string;

  childMessage: string = 'Hello from Child!';

  @Output() 
  notify: EventEmitter<string> = new EventEmitter();

  sendNotification() {
    this.notify.emit(this.childMessage); // Emit data to parent
  }
}
