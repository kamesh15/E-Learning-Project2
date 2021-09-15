import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class UpdateService {
  private course;
  constructor() {}
  public setCourse(course) {
    this.course = course;
  }
  public getCourse() {
    return this.course;
  }
}
