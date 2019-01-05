import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChartExampleComponent } from './view_components/chart-example/chart-example.component';
import { MainPageComponent } from './view_components/main_page/main-page.component';

const routes: Routes = [
{
  path: "comp1",
  component: MainPageComponent
},
{
  path: "comp2",
  component: ChartExampleComponent
}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
