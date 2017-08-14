package inc.tractor.reservationsystem.data.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import inc.tractor.reservationsystem.data.entity.Vehicle;

@Repository
public interface VehicleRepository extends CrudRepository<Vehicle, Long> {

//	Vehicle findByVin(String vin);
//	Vehicle FindByNickname(String nickname);
	
}
