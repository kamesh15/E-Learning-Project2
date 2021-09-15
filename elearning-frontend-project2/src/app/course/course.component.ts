import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { TeacherService } from '../teacher.service';
import { UpdateService } from '../update.service';

@Component({
  selector: 'app-course',
  templateUrl: './course.component.html',
  styleUrls: ['./course.component.css']
})
export class CourseComponent implements OnInit {
  public course;
  public formCourse = new FormGroup({
    id: new FormControl(''),
    title: new FormControl(''),
    imageUrl: new FormControl(''),
    category: new FormControl(''),
    content: new FormControl('')
  });
  constructor(
    private teacherService: TeacherService,
    private updateService: UpdateService
  ) {
    this.teacherService = teacherService;
  }

  ngOnInit() {
    this.course = this.updateService.getCourse();
    this.formCourse.setValue(this.course);
  }

  updateCourse(courseData) {
    this.teacherService.updateCourse(courseData).subscribe(res => {
      console.log(res);
    });
  }
}
