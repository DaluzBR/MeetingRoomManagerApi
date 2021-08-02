import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { RoomDetailsComponent } from './room-details/room-details.component';
import { CreateRoomComponent } from './room-create/room-create.component';
import { RoomListComponent } from './room-list/room-list.component';
import { UpdateRoomComponent } from './room-update/room-update.component';
import { RoomDeleteComponent } from './room-delete/room-delete.component';
import { Error404Component } from './room-error/room-error-404.component';

const routes: Routes = [
  { path: '', redirectTo: 'rooms', pathMatch: 'full' },
  { path: 'rooms', component: RoomListComponent },
  { path: 'add', component: CreateRoomComponent },
  { path: 'update/:id', component: UpdateRoomComponent },
  { path: 'delete/:id', component: RoomDeleteComponent },
  { path: 'details/:id', component: RoomDetailsComponent },
  { path: '**', component: Error404Component}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
