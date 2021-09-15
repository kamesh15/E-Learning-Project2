import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-home',
  templateUrl: './student-home.component.html',
  styleUrls: ['./student-home.component.css']
})
export class StudentHomeComponent implements OnInit {
  public courses = [];

  constructor(
    private studentService: StudentService,
    private loginService: LoginService
  ) {}

  ngOnInit() {
    this.studentService.getCourses().subscribe(res => {
      this.courses = res;
    });
  }
  enrollCourse(courseId) {
    this.studentService
      .enrollCourse(courseId, this.loginService.getProfile().id)
      .subscribe(res => {
        this.loginService.setProfile(res);
      });
  }
}
