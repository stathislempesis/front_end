import { Injectable } from "@angular/core";
import { Http } from "@angular/http";
import { Observable, from} from 'rxjs';
import "rxjs/add/operator/map";
import { Trend } from "./trend.model";


@Injectable()
export class TrendsDataSource {

  constructor(private http: Http){ }

  getData(): Observable<Trend[]> {


          return this.http.get('http://192.168.1.17:8080/trendsLists_current/trends').map(response => response.json());

      }

}
