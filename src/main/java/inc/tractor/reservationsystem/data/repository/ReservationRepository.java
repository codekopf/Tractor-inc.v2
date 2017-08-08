package inc.tractor.reservationsystem.data.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import inc.tractor.reservationsystem.data.entity.Rent;

@Repository
public interface RentRepository extends CrudRepository<Rent, Long> {
    List<Rent> findByDate(Date date);
}
