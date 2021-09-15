import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-add-course',
  templateUrl: './add-course.component.html',
  styleUrls: ['./add-course.component.css']
})
export class AddCourseComponent implements OnInit {
  private teacherService;
  public formCourse = new FormGroup({
    title: new FormControl(''),
    imageUrl: new FormControl(''),
    category: new FormControl(''),
    content: new FormControl('')
  });
  constructor(teacherService: TeacherService) {
    this.teacherService = teacherService;
  }
  ngOnInit() {}
  addCourse(data): void {
    this.teacherService.addCourse(data).subscribe(res => {
      if (res != null) this.formCourse.reset();
    });
  }
}
