import { Room } from '../room';
import { Component, OnInit } from '@angular/core';
import { RoomService } from '../room.service';
import { RoomListComponent } from '../room-list/room-list.component';
import { Router, ActivatedRoute } from '@angular/router';
import { Observable } from "rxjs";

@Component({
  selector: 'app-room-delete',
  templateUrl: './room-delete.component.html',
  styleUrls: ['./room-delete.component.css']
})
export class RoomDeleteComponent implements OnInit {

  id: number;
  room: Room;

  constructor(private route: ActivatedRoute, private router: Router,
    private roomService: RoomService) { }

  rooms: Observable<Room[]>;

  ngOnInit() {
    this.room = new Room();

    this.id = this.route.snapshot.params['id'];

    this.roomService.getRoom(this.id)
      .subscribe(data => {
        console.log(data)
        this.room = data;
      }, error => console.log(error));
  }

  reloadData() {
    this.rooms = this.roomService.getRoomsList();
    this.listRooms();
  }

  deleteRoom(id: number) {
    this.roomService.deleteRoom(id)
      .subscribe(
        data => {
          console.log(data);
          this.reloadData();
        },
        error => console.log(error));

  }

  listRooms() {
    this.router.navigate(['/rooms']);
  }

}
