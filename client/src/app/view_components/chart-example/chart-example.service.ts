import { Injectable } from '@angular/core';
import { Tweet } from "../../tweet/tweet";
import { Observable } from "rxjs/Observable";
import { Http, Response } from "@angular/http";

@Injectable({
  providedIn: 'root'
})
export class ChartExampleService {

  private apiUrl = 'http://localhost:8080/users';

  constructor(private http: Http) { }

  findById(id: number): Observable<any> {
    const url = `${this.apiUrl}/${id}/tweets`;
    return this.http.get(url)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
}
