import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { ChartExampleComponent } from './view_components/chart-example/chart-example.component';
import { UserComponent } from './user/user.component';

const routes: Routes = [
{
  path: "comp1",
  component: UserComponent
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
