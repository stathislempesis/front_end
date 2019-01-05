import { Injectable } from "@angular/core";
import { Trend } from "./trend.model";
import { Observable } from 'rxjs';
import { TrendsDataSource } from "./trends.datasource";


@Injectable()
export class TrendsRepository {

  private trends: Trend[] = new Array<Trend>();
  private locator = (t: Trend, name: string) => t.name == name;


  constructor(private dataSource: TrendsDataSource)
  {
    this.dataSource.getData().subscribe(data => this.trends = data);
  }


  getTrends(): Trend[] {
    return this.trends;
  }


  getTrend(name: string): Trend {
        return this.trends.find(t => this.locator(t, name));
  }


}
