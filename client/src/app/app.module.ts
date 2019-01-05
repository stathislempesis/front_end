import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { HttpModule } from '@angular/http';
import { TopPanelComponent } from './view_components/top-panel/top-panel.component';
import { MatListModule,MatIconModule, MatSidenavModule, MatToolbarModule,MatButtonModule, MatCardModule } from '@angular/material';
import { LeftSidePanelComponent } from './view_components/left-side-panel/left-side-panel.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import { ChartExampleComponent } from './view_components/chart-example/chart-example.component';
import { ChartsModule } from 'ng2-charts';
import { FlexLayoutModule } from '@angular/flex-layout';
import { AppRoutingModule } from './app-routing.module';
import { MainPageComponent } from './view_components/main_page/main-page.component';
import { TrendsModule } from './trends/trends.module';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    TopPanelComponent,
    LeftSidePanelComponent,
    ChartExampleComponent,
    MainPageComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    AppRoutingModule,
    HttpModule, MatListModule, MatToolbarModule, MatSidenavModule, MatIconModule, MatButtonModule, MatCardModule,
    BrowserAnimationsModule,ChartsModule, FlexLayoutModule, TrendsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
