import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-index',
  templateUrl: './index.component.html',
  styleUrls: ['./index.component.css']
})
export class IndexComponent implements OnInit {
  public appName = 'E-Learning';
  public courses = [];
  constructor(private studentService: StudentService) {}

  ngOnInit() {
    this.studentService.getCourses().subscribe(res => {
      this.courses = res;
    });
  }
}
