import { NgModule } from "@angular/core";
import { HttpModule } from "@angular/http";
import { CommonModule } from '@angular/common';
import { MatCardModule } from '@angular/material/card';

import { TrendsComponent } from "./trends.component";
import { TrendsRepository } from "../models/trend/trends.repository";
import { TrendsDataSource } from "../models/trend/trends.datasource";



@NgModule({
  imports: [HttpModule, CommonModule, MatCardModule ],
  providers: [TrendsRepository, TrendsDataSource],
  declarations: [TrendsComponent],
  exports: [TrendsComponent]
})

export class TrendsModule{ }
