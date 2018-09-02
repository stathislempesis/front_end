import { Injectable } from '@angular/core';
import { User } from "./user";
import { Http, Response } from "@angular/http";
import 'rxjs/add/operator/map'
import 'rxjs/add/operator/catch';
import { Observable } from "rxjs/Observable";
 
@Injectable()
export class UserService {
 
  private apiUrl = 'http://localhost:8080/api/users';
 
  constructor(private http: Http) {
  }
 
  findAll(): Observable<User[]>  {
    return this.http.get(this.apiUrl)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
 
  findById(id: number): Observable<User> {
    const url = `${this.apiUrl}/${id}`;
    return this.http.get(url)
      .map((res:Response) => res.json() as User)
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
 
}
