import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { ViewFlightComponent } from './view-flight/view-flight.component';
import { AdminComponent } from './admin/admin.component';
import { RouterModule, Routes } from '@angular/router';
import { FormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';
import { UpcomingFlightsComponent } from './upcoming-flights/upcoming-flights.component';
import { HttpClientModule } from '@angular/common/http';


const allLinks:Routes = [
  {path:'registerflight',component:AdminComponent},
  {path:'view',component:ViewFlightComponent},
  // {path:'searchFlights',component:UpcomingFlightsComponent},
  {path:'upcomingflights',component:UpcomingFlightsComponent},
  
 

]

@NgModule({
  declarations: [
    AppComponent,
    ViewFlightComponent,
    AdminComponent,
    UpcomingFlightsComponent
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allLinks),FormsModule,CommonModule,HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
