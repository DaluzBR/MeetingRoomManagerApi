package br.com.daluz.MeetingRoomManagerApi.repositories;


import br.com.daluz.MeetingRoomManagerApi.models.Room;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoomRepository extends JpaRepository<Room, Long> {

}
