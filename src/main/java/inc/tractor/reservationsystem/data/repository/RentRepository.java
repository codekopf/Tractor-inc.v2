package inc.tractor.reservationsystem.data.repository;

import inc.tractor.reservationsystem.data.entity.Client;
import inc.tractor.reservationsystem.data.entity.Rent;
import inc.tractor.reservationsystem.data.entity.Vehicle;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;


@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    List<Rent> findByDate(Date date);
}
