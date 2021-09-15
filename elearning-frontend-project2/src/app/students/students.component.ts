import { Component, OnInit } from '@angular/core';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-students',
  templateUrl: './students.component.html',
  styleUrls: ['./students.component.css']
})
export class StudentsComponent implements OnInit {
  private teacherService;
  public students = [];
  constructor(teacherService: TeacherService) {
    this.teacherService = teacherService;
  }

  ngOnInit() {
    this.teacherService.getStudents().subscribe(data => {
      this.students = data;
    });
  }
}
