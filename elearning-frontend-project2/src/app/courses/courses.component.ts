import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { TeacherService } from '../teacher.service';
import { UpdateService } from '../update.service';

@Component({
  selector: 'app-courses',
  templateUrl: './courses.component.html',
  styleUrls: ['./courses.component.css']
})
export class CoursesComponent implements OnInit {
  public courses = [];
  constructor(
    private teacherService: TeacherService,
    private router: Router,
    private updateService: UpdateService
  ) {}

  ngOnInit() {
    this.teacherService.getCourses().subscribe(res => {
      this.courses = res;
    });
  }
  deleteCourse(id): void {
    this.teacherService.deleteCourse(id).subscribe(data => console.log(data));
  }
  updateCourse({ course }): void {
    this.updateService.setCourse(course);
    this.router.navigate(['/course']);
  }
}
