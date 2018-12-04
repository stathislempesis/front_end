import { Injectable } from '@angular/core';
import { Http, Response } from "@angular/http";
import { Observable } from "rxjs/Observable";
import { HubRetweeter } from "./hubretweeter";
import 'rxjs/add/operator/map';
import 'rxjs/add/operator/catch';

@Injectable({
  providedIn: 'root'
})
export class MainPageService {

  private apiUrl = 'http://localhost:8080/hubretweeter';

  constructor(private http: Http) {}

  findHubRetweeter(): Observable<HubRetweeter>  {
    return this.http.get(this.apiUrl)
      .map((res:Response) => res.json())
      .catch((error:any) => Observable.throw(error.json().error || 'Server error'));
  }
}
