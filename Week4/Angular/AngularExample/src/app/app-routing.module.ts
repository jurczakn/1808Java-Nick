import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersComponent } from './components/users/users.component';
import { ExampleComponent } from './components/example/example.component';

export const routes: Routes = [
    { path: '', redirectTo: 'users', pathMatch: 'full'},
    { path: 'users', component: UsersComponent },
    { path: 'example', component: ExampleComponent }
];

@NgModule({
    imports: [RouterModule.forRoot(routes)],
    exports: [RouterModule]
})
export class AppRoutingModule {}
