package inc.tractor.reservationsystem.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import inc.tractor.reservationsystem.data.entity.Reservation;

@Repository
public interface ReservationRepository extends CrudRepository<Reservation, Long> {

	Reservation findBySurname(String surname);
	
}
