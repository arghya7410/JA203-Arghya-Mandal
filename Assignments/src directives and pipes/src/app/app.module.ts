import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HelloComponent } from './hello/hello.component';
import { FormsModule } from '@angular/forms';
import { CardHoverDirective } from './card-hover.directive';
import { MultiplyPipe } from './multiply.pipe';

@NgModule({
  declarations: [
    AppComponent,
    HelloComponent,
    CardHoverDirective,
    MultiplyPipe
  ],
  imports: [
    BrowserModule,
    AppRoutingModule
    ,FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
