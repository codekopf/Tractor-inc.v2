package inc.tractor.reservationsystem.business.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inc.tractor.reservationsystem.business.domain.VehicleReservation;
import inc.tractor.reservationsystem.data.entity.Client;
import inc.tractor.reservationsystem.data.entity.Rent;
import inc.tractor.reservationsystem.data.entity.Vehicle;
import inc.tractor.reservationsystem.data.repository.ClientRepository;
import inc.tractor.reservationsystem.data.repository.RentRepository;
import inc.tractor.reservationsystem.data.repository.VehicleRepository;

@Service
public class VehicleReservationService {
    private VehicleRepository vehicleRepository;
    private ClientRepository clientRepository;
    private RentRepository rentRepository;

    @Autowired
    public void ReservationService(VehicleRepository vehicleRepository, ClientRepository clientRepository, RentRepository rentRepository) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.rentRepository = rentRepository;
    }

    public List<VehicleReservation> getVehicleReservationsForDate(Date date){
        Iterable<Vehicle> vehicles = this.vehicleRepository.findAll();
        Map<Long, VehicleReservation> vehicleReservationMap = new HashMap<>();
        vehicles.forEach(vehicle->{
            VehicleReservation vehicleReservation = new VehicleReservation();
            vehicleReservation.setVehicleId(vehicle.getId());
            vehicleReservation.setVehicleVin(vehicle.getVin());
            // vehicleReservation.setVehicleLicenceplate(vehicle.getLicenceplate());
            vehicleReservationMap.put(vehicle.getId(), vehicleReservation);
        });
        
        Iterable<Rent> reservations = this.rentRepository.findByDate(new java.sql.Date(date.getTime()));
        if(null!=reservations){
            reservations.forEach(reservation -> {
                Client client = this.clientRepository.findOne(reservation.getClientId());
                if(null!=client){
                    VehicleReservation vehicleReservation = vehicleReservationMap.get(reservation.getId());
                    vehicleReservation.setDate(date);
                    vehicleReservation.setName(client.getName());
                    vehicleReservation.setSurname(client.getSurname());
                    vehicleReservation.setClientId(client.getId());
                }
            });
        }
        List<VehicleReservation> vehicleReservations = new ArrayList<>();
        for(Long vehicleId:vehicleReservationMap.keySet()){
            vehicleReservations.add(vehicleReservationMap.get(vehicleId));
        }
        return vehicleReservations;
    }
}
