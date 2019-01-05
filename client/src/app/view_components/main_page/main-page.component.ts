import { Component, OnInit } from '@angular/core';
import { HubRetweeter } from "./hubretweeter";
import { MainPageService } from "./main-page.service";

@Component({
  selector: 'app-main-page',
  templateUrl: './main-page.component.html',
  styleUrls: ['./main-page.component.css'],
  providers: [MainPageService]
})
export class MainPageComponent implements OnInit {

  private hubretweeter: HubRetweeter;

  constructor(private mainPageService: MainPageService) {}

  ngOnInit() {
   this.getHubRetweeter();
  }

  getHubRetweeter() {
    this.mainPageService.findHubRetweeter().subscribe(
      hubretweeter => {
        this.hubretweeter = hubretweeter;
      },
      err => {
        console.log(err);
      }
    );
  }
}
