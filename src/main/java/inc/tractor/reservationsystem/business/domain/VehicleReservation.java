package inc.tractor.reservationsystem.business.domain;

import java.util.Date;

public class VehicleReservation {
    private long vehicleId;
    private long clientId;
    // private String vehicleLicenceplate;
    private String vehicleVin;
    private String vehicleNumber;
    private String clientFirstName;
    private String clientLastName;
    private String clientIco;
    private Date date;
    
   
	public long getVehicleId() {
		return vehicleId;
	}
	public void setVehicleId(long vehicleId) {
		this.vehicleId = vehicleId;
	}
	public long getClientId() {
		return clientId;
	}
	public void setClientId(long clientId) {
		this.clientId = clientId;
	}
	public String getVehicleVin() {
		return vehicleVin;
	}
	public void setVehicleVin(String vehicleVin) {
		this.vehicleVin = vehicleVin;
	}
	public String getVehicleNumber() {
		return vehicleNumber;
	}
	public void setVehicleNumber(String vehicleNumber) {
		this.vehicleNumber = vehicleNumber;
	}
	public String getClientFirstName() {
		return clientFirstName;
	}
	public void setClientFirstName(String clientFirstName) {
		this.clientFirstName = clientFirstName;
	}
	public String getClientLastName() {
		return clientLastName;
	}
	public void setClientLastName(String clientLastName) {
		this.clientLastName = clientLastName;
	}
	public String getClientIco() {
		return clientIco;
	}
	public void setClientIco(String clientIco) {
		this.clientIco = clientIco;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
    
    
}