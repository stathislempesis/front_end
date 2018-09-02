import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';
import { AppComponent } from './app.component';
import { UserComponent } from './user/user.component';
import { HttpModule } from '@angular/http';
import { TopPanelComponent } from './view_components/top-panel/top-panel.component';
import { MatButtonModule, MatListModule, MatToolbarModule } from '@angular/material';

@NgModule({
  declarations: [
    AppComponent,
    UserComponent,
    TopPanelComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    HttpModule,
	MatButtonModule, MatListModule, MatToolbarModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
