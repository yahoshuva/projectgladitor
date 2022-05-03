import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class AdmindashserService {

  constructor(private myhttp:HttpClient) { }
  restUrl:string="http://localhost:8383/rest/api";


  searchbyID(srchText:any)
  {
    return this.myhttp.get(this.restUrl+"/searchadmin/"+srchText);
  }
}