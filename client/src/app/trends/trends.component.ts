import { Component } from "@angular/core";
import { Trend } from "../models/trend/trend.model";

import { TrendsRepository } from "../models/trend/trends.repository";


@Component({
  selector: "trends",
  templateUrl: "trends.component.html"
})

export class TrendsComponent{

  constructor(private repository: TrendsRepository){}

  trends(): Trend[]{
    return this.repository.getTrends();
  }


}
