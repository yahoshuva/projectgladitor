import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class AdminloginserService {

 
constructor(private myhttp:HttpClient) { }
  restUrl:string="http://localhost:8383/rest/api";

  validateLogin(loginValues:any)
  {
    return this.myhttp.get(this.restUrl+"/admin/"+loginValues.email+"/"+loginValues.password);
  }
}
