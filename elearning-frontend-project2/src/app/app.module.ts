import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { FormsModule, ReactiveFormsModule } from '@angular/forms';
import { HttpClientModule } from '@angular/common/http';

import { AppComponent } from './app.component';
import { AppRouting } from './routing.module';
import { HomeComponent } from './home/home.component';
import { CoursesComponent } from './courses/courses.component';
import { CourseComponent } from './course/course.component';
import { AddCourseComponent } from './add-course/add-course.component';
import { NavbarComponent } from './navbar/navbar.component';
import { ProfileComponent } from './profile/profile.component';
import { StudentsComponent } from './students/students.component';
import { LoginComponent } from './login/login.component';
import { IndexComponent } from './index/index.component';
import { RegisterComponent } from './register/register.component';
import { IndexnavComponent } from './indexnav/indexnav.component';
import { StudentLoginComponent } from './student-login/student-login.component';
import { StudentHomeComponent } from './student-home/student-home.component';
import { StudentProfileComponent } from './student-profile/student-profile.component';
import { StudentEnrollmentComponent } from './student-enrollment/student-enrollment.component';
import { StudentnavComponent } from './studentnav/studentnav.component';

@NgModule({
  imports: [
    BrowserModule,
    FormsModule,
    AppRouting,
    HttpClientModule,
    ReactiveFormsModule
  ],
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    CoursesComponent,
    CourseComponent,
    ProfileComponent,
    AddCourseComponent,
    StudentsComponent,
    LoginComponent,
    RegisterComponent,
    IndexComponent,
    IndexnavComponent,
    StudentLoginComponent,
    StudentHomeComponent,
    StudentProfileComponent,
    StudentEnrollmentComponent,
    StudentnavComponent
  ],
  bootstrap: [AppComponent]
})
export class AppModule {}
