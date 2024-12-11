import { Component } from '@angular/core';
import { ProductsService } from '../products.service';
import { Products } from '../Products';

@Component({
  selector: 'app-add-product',
  templateUrl: './add-product.component.html',
  styleUrls: ['./add-product.component.css']
})
export class AddProductComponent {
  constructor(private  service:ProductsService){}
  addProduct(product:Products){
    this.service.addProduct(product).subscribe(
        (response)=>{  console.log(response);
          alert(response.id +" product added successfully")
        } ,
        (err)=>{ console.log(err)}
    );
}
}
