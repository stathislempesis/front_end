import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { HttpModule } from '@angular/http';
import { TopPanelComponent } from './view_components/top-panel/top-panel.component';
import { MatListModule,MatIconModule, MatSidenavModule, MatToolbarModule,MatButtonModule } from '@angular/material';
import { LeftSidePanelComponent } from './view_components/left-side-panel/left-side-panel.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { TweetComponent } from './tweet/tweet.component';
import { ChartExampleComponent } from './view_components/chart-example/chart-example.component';
import { ChartsModule } from 'ng2-charts';
import { FlexLayoutModule } from '@angular/flex-layout';
import { AppRoutingModule } from './app-routing.module';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    TopPanelComponent,
    LeftSidePanelComponent,
    TweetComponent,
    ChartExampleComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    HttpModule, MatListModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatButtonModule,
    BrowserAnimationsModule,ChartsModule, FlexLayoutModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
