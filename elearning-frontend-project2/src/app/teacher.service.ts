import { HttpParams } from '@angular/common/http';
import { HttpHeaders } from '@angular/common/http';
import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TeacherService {
  private httpClient: HttpClient;
  private readonly baseUrl =
    'https://elearning-application-revature.herokuapp.com/';
  headers = new HttpHeaders().append('Content-Type', 'application/json');
  constructor(httpClient: HttpClient) {
    this.httpClient = httpClient;
  }

  public addCourse(course): Observable<Object> {
    return this.httpClient.post(this.baseUrl + 'add-course', course, {
      headers: this.headers
    });
  }
  public getCourse(id): Observable<any> {
    return this.httpClient.get(this.baseUrl + 'get-course/' + id);
  }
  public getCourses(): Observable<any> {
    return this.httpClient.get(this.baseUrl + 'get-courses');
  }
  public updateCourse(course): Observable<Object> {
    return this.httpClient.put(this.baseUrl + 'update-course', course, {
      headers: this.headers
    });
  }
  public deleteCourse(id): Observable<Object> {
    return this.httpClient.delete(this.baseUrl + 'delete-course/' + id);
  }
  public getProfile(): Observable<Object> {
    return this.httpClient.get(this.baseUrl + 'get-profile');
  }
  public getStudents(): Observable<any> {
    return this.httpClient.get(this.baseUrl + 'get-students');
  }
  public login(userid: string, password: string): Observable<any> {
    return this.httpClient.post(this.baseUrl + 'login', null, {
      params: new HttpParams()
        .append('userid', userid)
        .append('password', password)
    });
  }
}
