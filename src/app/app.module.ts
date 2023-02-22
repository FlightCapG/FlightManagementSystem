import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewFlightComponent } from './view-flight/view-flight.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { HttpClientModule } from '@angular/common/http';
import { AddFlightComponent } from './add-flight/add-flight.component';


const allLinks:Routes = [
  {path:'registerFlight',component:AddFlightComponent},
  {path:'view',component:ViewFlightComponent},
]

@NgModule({
  declarations: [
    AppComponent,
    ViewFlightComponent,
    AddFlightComponent,
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allLinks),FormsModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
