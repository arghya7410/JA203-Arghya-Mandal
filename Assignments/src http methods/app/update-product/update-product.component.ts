import { Component } from '@angular/core';
import { ProductsService } from '../products.service';
import { Products } from '../Products';

@Component({
  selector: 'app-update-product',
  templateUrl: './update-product.component.html',
  styleUrls: ['./update-product.component.css']
})
export class UpdateProductComponent {
  constructor(private  service:ProductsService){}
  updateProductDetails(product:Products){
    this.service.updateProductDetails(product).subscribe(
        (response)=>{ console.log(response); alert("product updated successfully..") } ,
        (err)=>{ console.log(err)}
    );
}
}
