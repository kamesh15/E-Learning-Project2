import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { StudentService } from '../student.service';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {
  public appName = 'E-Learning';
  studentForm = new FormGroup({
    name: new FormControl(''),
    email: new FormControl(''),
    phoneNumber: new FormControl(''),
    password: new FormControl('')
  });

  constructor(private studentService: StudentService, private router: Router) {}

  ngOnInit() {}

  addStudent(data) {
    this.studentService.addStudent(data).subscribe(res => {
      if (res != null) this.router.navigate(['/index']);
    });
  }
}
