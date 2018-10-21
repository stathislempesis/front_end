import { Component, OnInit } from '@angular/core';
import { ChartExampleService } from "./chart-example.service";
import {formatDate} from '@angular/common'

@Component({
  selector: 'app-chart-example',
  templateUrl: './chart-example.component.html',
  styleUrls: ['./chart-example.component.css']
})
export class ChartExampleComponent implements OnInit {

//private tweets: Tweet[];

constructor(private chartExampleService: ChartExampleService) {}

public chartOptions :any ={
      responsive: true,
    maintainAspectRatio: false
    };

public chartData : { label: string, data: Array<any> }[] = [];

  /*public chartData :Array<any> = [
      { data: [330, 600, 260, 700], label: 'Account A' },
      { data: [120, 455, 100, 340], label: 'Account B' },
      { data: [45, 67, 800, 500], label: 'Account C' }
    ];*/

 public chartLabels :Array<any> = [];

ngOnInit() {
    this.getTweets();
  }

getTweets() {
    this.chartExampleService.findById(1034105453989572608).subscribe(
      tweets => {
        //this.tweets = tweets;

        let arr: any[];
        arr = [];
        for (let stat of tweets) {
             arr.push(stat[1]);
             this.chartLabels.push(formatDate(new Date(stat[0]), 'longDate', 'en'));
       }

       this.chartData.push({
                    label: "Number of tweets",
                    data: arr
                });
      },
      err => {
        console.log(err);
      }

    );
  }
  /*onChartClick(event) {
    console.log(event);
  }*/

}
