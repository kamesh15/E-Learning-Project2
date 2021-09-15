import { Component, OnInit } from '@angular/core';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-student-profile',
  templateUrl: './student-profile.component.html',
  styleUrls: ['./student-profile.component.css']
})
export class StudentProfileComponent implements OnInit {
  public profile;
  constructor(private loginService: LoginService) {}

  ngOnInit() {
    this.profile = this.loginService.getProfile();
  }
}
