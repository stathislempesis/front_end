import { Component, OnInit } from '@angular/core';
import { Tweet } from "../../tweet/tweet";
import { ChartExampleService } from "./chart-example.service";

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

public chartData : { label: string, data: Array<any> }[] = [
        {
            label: "Quantities",
            data: Array<any>()
        }
    ];

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
             this.chartLabels.push(stat[0]);
       }

       this.chartData.push({
                    label: 'title',
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
