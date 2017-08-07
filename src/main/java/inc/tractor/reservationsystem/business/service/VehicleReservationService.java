package inc.tractor.reservationsystem.business.service;


import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import inc.tractor.reservationsystem.business.domain.VehicleReservation;
import inc.tractor.reservationsystem.data.entity.Vehicle;
import inc.tractor.reservationsystem.data.repository.ClientRepository;
import inc.tractor.reservationsystem.data.repository.VehicleRepository;

@Service
public class VehicleReservationService {
    private VehicleRepository vehicleRepository;
    private ClientRepository clientRepository;
    private ReservationRepository reservationRepository;

    @Autowired
    public ReservationService(VehicleRepository vehicleRepository, ClientRepository clientRepository, ReservationRepository reservationRepository) {
        this.vehicleRepository = vehicleRepository;
        this.clientRepository = clientRepository;
        this.reservationRepository = reservationRepository;
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
        
        Iterable<Reservation> reservations = this.reservationRepository.findByDate(new java.sql.Date(date.getTime()));
        if(null!=reservations){
            reservations.forEach(reservation -> {
                Guest guest = this.guestRepository.findOne(reservation.getGuestId());
                if(null!=guest){
                    RoomReservation roomReservation = roomReservationMap.get(reservation.getId());
                    roomReservation.setDate(date);
                    roomReservation.setFirstName(guest.getFirstName());
                    roomReservation.setLastName(guest.getLastName());
                    roomReservation.setGuestId(guest.getId());
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
