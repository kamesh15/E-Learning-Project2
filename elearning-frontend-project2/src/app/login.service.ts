import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {
  private profile;
  constructor() {}
  public setProfile(profile) {
    this.profile = profile;
  }
  public getProfile() {
    return this.profile;
  }
}
