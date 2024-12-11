import { Component } from '@angular/core';
import { Products } from '../Products';
import { ProductsService } from '../products.service';

@Component({
  selector: 'app-display',
  templateUrl: './display.component.html',
  styleUrls: ['./display.component.css']
})
export class DisplayComponent {
  productList: Products[] = [];
  constructor(private service:ProductsService){}

  getAllProducts(){
    this.service.getAllProducts().subscribe({
      next: (products) => {
        this.productList = products; 
        console.log(this.productList)
      }
    });
  }
  deleteById(id:number){
    this.service.deleteById(id).subscribe({
      next: (data) => {
        console.log(id + " record deleted");
        this.getAllProducts();
      },
      error: (err) => {
        console.log(err);
      }
    });
    
  }
}


