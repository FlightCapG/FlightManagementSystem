import { ComponentFixture, TestBed } from '@angular/core/testing';

import { ViewScheduleFlightComponent } from './view-schedule-flight.component';

describe('ViewScheduleFlightComponent', () => {
  let component: ViewScheduleFlightComponent;
  let fixture: ComponentFixture<ViewScheduleFlightComponent>;

  beforeEach(async () => {
    await TestBed.configureTestingModule({
      declarations: [ ViewScheduleFlightComponent ]
    })
    .compileComponents();

    fixture = TestBed.createComponent(ViewScheduleFlightComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
