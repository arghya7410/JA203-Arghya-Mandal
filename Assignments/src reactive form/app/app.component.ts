import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup, Validators } from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit {
  title = 'webapp';
  registerForm!: FormGroup;
  submitted:boolean = false;
  empData:any;
  constructor(private fb:FormBuilder) {
    
  }
  ngOnInit(): void {
    this.registerForm = this.fb.group({
      eid: ['', Validators.required],
      ename: ['', [Validators.required, Validators.minLength(3), Validators.maxLength(25)]],
      salary: ['', [Validators.required, Validators.pattern("^[0-9]*$"), Validators.min(0)]]
    })
  }

  onSubmit() {
    this.submitted = true;
    if (this.registerForm.invalid) {
      return ;
    }
    else {
      this.empData = this.registerForm.value;
      console.log(this.registerForm.value)
    }
  }
  get f(){
    return this.registerForm.controls;}
}
