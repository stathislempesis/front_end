import { Component} from '@angular/core';

@Component({
  selector: 'app-chart-example',
  templateUrl: './chart-example.component.html',
  styleUrls: ['./chart-example.component.css']
})
export class ChartExampleComponent{

public chartOptions :any ={
      responsive: true,
    maintainAspectRatio: false
    };

  public chartData :Array<any> = [
      { data: [330, 600, 260, 700], label: 'Account A' },
      { data: [120, 455, 100, 340], label: 'Account B' },
      { data: [45, 67, 800, 500], label: 'Account C' }
    ];

 public chartLabels :Array<any> = ['January', 'February', 'Mars', 'April'];

  /*onChartClick(event) {
    console.log(event);
  }*/

}
