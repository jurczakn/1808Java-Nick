import { Component, OnInit } from '@angular/core';
import { User } from '../../types/user';
import { UserService } from '../../services/user.service';

@Component({
  selector: 'app-users',
  templateUrl: './users.component.html',
  styleUrls: ['./users.component.css'],
  providers: [UserService]
})
export class UsersComponent implements OnInit {

  users: Array<User>;

  getUsers() {
    this.userService.getUsers().subscribe(
      data => this.users = data
    );
  }

  constructor(private userService: UserService) { }

  ngOnInit() {
  }

}
