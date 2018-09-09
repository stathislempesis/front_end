import { Component, OnInit } from '@angular/core';
import { User } from "./user";
import { UserService } from "./user.service";

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css'],
  providers: [UserService]
})
export class UserComponent implements OnInit {

  private users: User[];
  private user: User;

  constructor(private userService: UserService) {}

  ngOnInit() {
    this.getUser(); 
  }

 getAllUsers() {
    this.userService.findAll().subscribe(
      users => {
        this.users = users;
      },
      err => {
        console.log(err);
      }
 
    );
  }
  
  getUser() {
    this.userService.findById(1).subscribe(
      user => {
        this.user = user;
      },
      err => {
        console.log(err);
      }
 
    );
  }
}
