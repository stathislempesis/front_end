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

public chartDataTweets : { label: string, data: Array<any> }[] = [];
public chartDataRetweets : { label: string, data: Array<any> }[] = [];
public chartDataRetweeters : { label: string, data: Array<any> }[] = [];
public chartDataReplies : { label: string, data: Array<any> }[] = [];

public chartLabelsTweets :Array<any> = [];
public chartLabelsRetweets :Array<any> = [];
public chartLabelsRetweeters :Array<any> = [];
public chartLabelsReplies :Array<any> = [];

  /*public chartData :Array<any> = [
      { data: [330, 600, 260, 700], label: 'Account A' },
      { data: [120, 455, 100, 340], label: 'Account B' },
      { data: [45, 67, 800, 500], label: 'Account C' }
    ];*/

  ngOnInit() {
    this.getTweetsData();
    this.getRetweetsData();
    this.getRetweetersData();
    this.getRepliesData();
  }

  getTweetsData() {
    this.chartExampleService.findTweetsById(1034105453989572608).subscribe(
      data => {
        //this.tweets = tweets;

        let arr: any[];
        arr = [];
        for (let stat of data) {
             arr.push(stat[1]);
             this.chartLabelsTweets.push(formatDate(new Date(stat[0]), 'longDate', 'en'));
       }

       this.chartDataTweets.push({
                    label: "Number of tweets",
                    data: arr
                });
      },
      err => {
        console.log(err);
      }

    );
  }

  getRetweetsData() {
    this.chartExampleService.findRetweetsById(1034105453989572608).subscribe(
      data => {
        //this.tweets = tweets;

        let arr: any[];
        arr = [];
        for (let stat of data) {
             arr.push(stat[1]);
             this.chartLabelsRetweets.push(formatDate(new Date(stat[0]), 'longDate', 'en'));
       }

       this.chartDataRetweets.push({
                    label: "Number of retweets",
                    data: arr
                });
      },
      err => {
        console.log(err);
      }

    );
  }

  getRetweetersData() {
    this.chartExampleService.findRetweetersById(1034105453989572608).subscribe(
      data => {
        //this.tweets = tweets;

        let arr: any[];
        arr = [];
        for (let stat of data) {
             arr.push(stat[1]);
             this.chartLabelsRetweeters.push(formatDate(new Date(stat[0]), 'longDate', 'en'));
       }

       this.chartDataRetweeters.push({
                    label: "Number of retweeters",
                    data: arr
                });
      },
      err => {
        console.log(err);
      }

    );
  }

  getRepliesData() {
    this.chartExampleService.findRepliesById(1034105453989572608).subscribe(
      data => {
        //this.tweets = tweets;

        let arr: any[];
        arr = [];
        for (let stat of data) {
             arr.push(stat[1]);
             this.chartLabelsReplies.push(formatDate(new Date(stat[0]), 'longDate', 'en'));
       }

       this.chartDataReplies.push({
                    label: "Number of replies",
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
