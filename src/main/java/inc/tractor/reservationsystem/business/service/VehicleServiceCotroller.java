package inc.tractor.reservationsystem.business.service;

import org.springframework.beans.factory.annotation.Autowired;

import inc.tractor.reservationsystem.data.repository.ClientRepository;
import inc.tractor.reservationsystem.data.repository.RentRepository;
import inc.tractor.reservationsystem.data.repository.VehicleRepository;

public class VehicleServiceCotroller {
    private VehicleRepository vehicleRepository;
    private ClientRepository clientRepository;
    private RentRepository rentRepository;

    @Autowired
    public void ReservationService(VehicleRepository vehicleRepository, ClientRepository clientRepository, RentRepository rentRepository) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.rentRepository = rentRepository;
    }

}
