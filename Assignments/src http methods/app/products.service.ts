import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Products } from './Products';

@Injectable({
  providedIn: 'root'
})

export class ProductsService {

  baseURL:string = "http://localhost:3000/products/";
  constructor(private http:HttpClient) { }
  getAllProducts(): Observable<Products[]>{
    return this.http.get<Products[]>(this.baseURL);
  }
  deleteById(id:number){
    return this.http.delete(this.baseURL+id);
 }
 addProduct(product:Products):Observable<Products>{
  return  this.http.post<Products>(this.baseURL,product);
}
updateProductDetails(product:Products):Observable<Products>{
  return  this.http.put<Products>(this.baseURL+product.id , product);
}
searchByProductName(pname:string):Observable<Products[]>{
  return  this.http.get<Products[]>(this.baseURL+"?pname="+pname);
}
}
