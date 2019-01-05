import { Injectable } from '@angular/core';
//import { Tweet } from "../../tweet/tweet";
import { Observable } from "rxjs/Observable";
import { Http, Response } from "@angular/http";

@Injectable({
  providedIn: 'root'
})
export class ChartExampleService {

  private apiUrl = 'http://localhost:8080/users';

  constructor(private http: Http) { }

  findTweetsById(id: number): Observable<any> {
    /*const url = `${this.apiUrl}/${id}/tweets`;*/
     const url = `${this.apiUrl}/1034105453989572608/tweets`;
    return this.http.get(url)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findRetweetsById(id: number): Observable<any> {
    /*const url = `${this.apiUrl}/${id}/tweets`;*/
     const url = `${this.apiUrl}/1034105453989572608/retweets`;
    return this.http.get(url)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findRetweetersById(id: number): Observable<any> {
    /*const url = `${this.apiUrl}/${id}/tweets`;*/
     const url = `${this.apiUrl}/1034105453989572608/retweeters`;
    return this.http.get(url)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }

  findRepliesById(id: number): Observable<any> {
    /*const url = `${this.apiUrl}/${id}/tweets`;*/
     const url = `${this.apiUrl}/1034105453989572608/replies`;
    return this.http.get(url)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
}
