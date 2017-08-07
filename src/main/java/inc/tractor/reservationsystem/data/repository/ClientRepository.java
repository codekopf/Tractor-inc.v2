package inc.tractor.reservationsystem.data.repository;

import org.springframework.data.repository.PagingAndSortingRepository;

import inc.tractor.reservationsystem.data.entity.Client;

public interface ClientRepository extends PagingAndSortingRepository<Client, Long> {

	Client findByName(String name);
	Client findBySurname(String name);
	Client findByIco(String ico);

}
