import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { WifiComponent } from './components/wifi/wifi.component';

const routes: Routes = [
  {path: "wifi" , component: WifiComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
