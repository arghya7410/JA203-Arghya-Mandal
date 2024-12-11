import { Component } from '@angular/core';
import { ProductsService } from '../products.service';
import { Products } from '../Products';

@Component({
  selector: 'app-search-product',
  templateUrl: './search-product.component.html',
  styleUrls: ['./search-product.component.css']
})
export class SearchProductComponent {
  constructor(private  service:ProductsService){}
  productList:Products[] =[];
  searchByProductName(data:any){
    console.log(data.pname)
    this.service.searchByProductName(data.pname).subscribe(
     (response)=>{  console.log(response); this.productList = response; } ,
     (err)=>{ console.log(err)}
  );
}
}
