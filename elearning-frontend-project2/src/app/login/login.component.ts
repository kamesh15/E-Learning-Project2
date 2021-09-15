import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';
import { TeacherService } from '../teacher.service';
import { Router } from '@angular/router';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  public formData = new FormGroup({
    userid: new FormControl(''),
    password: new FormControl('')
  });
  public error;
  constructor(
    private teacherService: TeacherService,
    private router: Router,
    private loginService: LoginService
  ) {
    this.teacherService = teacherService;
    this.router = router;
  }
  ngOnInit() {}

  login(data) {
    this.teacherService.login(data.userid, data.password).subscribe(res => {
      if (res != null) {
        this.loginService.setProfile(res);
        this.router.navigate(['/home']);
      } else {
        this.error = 'Invalid User ID or Password';
      }
    });
  }
}
