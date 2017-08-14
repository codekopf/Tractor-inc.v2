package inc.tractor.reservationsystem.business.service;

import inc.tractor.reservationsystem.business.domain.VehicleReservation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping
public class ReservationServiceController {

    @Autowired
    private VehicleReservationService vehicleReservationService;

    @RequestMapping(method = RequestMethod.GET, value = "/reservations/{date}")
    public List<VehicleReservation> getAllReservationsForDate(@PathVariable(value="date") String dateString) {
        DateFormat format = new SimpleDateFormat("yyyy-MM-dd", Locale.ENGLISH);
        Date date = null;
        try {
            date = format.parse(dateString);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return this.vehicleReservationService.getVehicleReservationsForDate(date);
    }
}
