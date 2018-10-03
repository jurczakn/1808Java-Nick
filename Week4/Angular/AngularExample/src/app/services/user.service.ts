import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { User } from '../types/user';

@Injectable({
    providedIn: 'root'
})
export class UserService {
    readonly url = 'http://localhost:8080/RedirectForward/rest/user/';

    constructor(private http: HttpClient) {}

    getUsers() {
        return this.http.get<Array<User>>(this.url);
    }

}
