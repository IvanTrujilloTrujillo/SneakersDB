import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { SneakerFormComponent } from './components/sneaker-form/sneaker-form.component';
import { SneakerListComponent } from './components/sneaker-list/sneaker-list.component';

const routes: Routes = [
  {
    path: "form",
    component: SneakerFormComponent
  },
  {
    path: "list",
    component: SneakerListComponent
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
