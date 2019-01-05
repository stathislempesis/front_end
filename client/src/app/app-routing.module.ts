import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChartExampleComponent } from './view_components/chart-example/chart-example.component';
import { MainPageComponent } from './view_components/main_page/main-page.component';
import { TrendsComponent } from './trends/trends.component';

const routes: Routes = [
{
  path: "comp1",
  component: MainPageComponent
},
{
  path: "comp2",
  component: ChartExampleComponent
},
{
  path: "trends",
  component: TrendsComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
