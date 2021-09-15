import { HttpHeaders } from '@angular/common/http';
import { HttpParams } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({ providedIn: 'root' })
export class StudentService {
  readonly baseUrl = 'https://elearning-application-revature.herokuapp.com/';
  headers = new HttpHeaders().append('Content-Type', 'application/json');
  constructor(private httpClient: HttpClient) {}
  addStudent(student): Observable<any> {
    return this.httpClient.post(this.baseUrl + 'add-student', student, {
      headers: this.headers
    });
  }
  getCourses(): Observable<any> {
    return this.httpClient.get(this.baseUrl + 'get-courses');
  }

  public login(userid: string, password: string): Observable<any> {
    return this.httpClient.post(this.baseUrl + 'student-login', null, {
      params: new HttpParams()
        .append('userid', userid)
        .append('password', password)
    });
  }

  public enrollCourse(courseid, studentid) {
    return this.httpClient.post(this.baseUrl + 'enroll-course', null, {
      params: new HttpParams().append('cid', courseid).append('sid', studentid)
    });
  }
}
