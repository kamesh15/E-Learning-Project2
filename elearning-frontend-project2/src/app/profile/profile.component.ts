import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';
import { TeacherService } from '../teacher.service';

@Component({
  selector: 'app-profile',
  templateUrl: './profile.component.html',
  styleUrls: ['./profile.component.css']
})
export class ProfileComponent implements OnInit {
  public profile;
  constructor(
    private teacherService: TeacherService,
    private loginService: LoginService
  ) {}

  ngOnInit() {
    this.profile = this.loginService.getProfile();
    console.log(this.profile);
  }
}
