import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { RouterModule, Routes } from '@angular/router';
import { CommonModule } from '@angular/common';
// import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { FormsModule} from '@angular/forms';
import {HttpClientModule} from '@angular/common/http';
import { ViewScheduleFlightComponent } from './view-schedule-flight/view-schedule-flight.component';
import { ScheduleComponent } from './schedule/schedule.component';

const allLinks:Routes=[
  {path:'view-scheduled-flight',component:ViewScheduleFlightComponent},
  {path:'app-schedule',component:ScheduleComponent},
]
@NgModule({
  declarations: [
    AppComponent,
    ViewScheduleFlightComponent,
    ScheduleComponent,
    // AppRoutingModule,
   
   
  ],
  imports: [
    BrowserModule,
    RouterModule.forRoot(allLinks),FormsModule,CommonModule,HttpClientModule
    
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }