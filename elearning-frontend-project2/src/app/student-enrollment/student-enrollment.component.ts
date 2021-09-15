import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-student-enrollment',
  templateUrl: './student-enrollment.component.html',
  styleUrls: ['./student-enrollment.component.css']
})
export class StudentEnrollmentComponent implements OnInit {
  enrollments = [];
  constructor(private loginService: LoginService) {}

  ngOnInit() {
    this.enrollments = this.loginService.getProfile().courselist;
  }
}
