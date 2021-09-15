import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student-login',
  templateUrl: './student-login.component.html',
  styleUrls: ['./student-login.component.css']
})
export class StudentLoginComponent implements OnInit {
  public formData = new FormGroup({
    userid: new FormControl(''),
    password: new FormControl('')
  });
  public error;
  constructor(
    private studentService: StudentService,
    private loginService: LoginService,
    private router: Router
  ) {}

  ngOnInit() {}
  login(data) {
    this.studentService.login(data.userid, data.password).subscribe(res => {
      console.log(res);
      if (res != null) {
        this.loginService.setProfile(res);
        this.router.navigate(['/student-home']);
      } else {
        this.error = 'Invalid User ID or Password';
      }
    });
  }
}
