package inc.tractor.reservationsystem.data.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="VEHICLE")
public class Vehicle {
	
	@Id
    @Column(name="ID")
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
	
    @Column(name="VIN")
    private String vin;
    
    @Column(name="CARS_TYPE")
    private String carsType;
    
    // @Coulmn(name) licenceplate
    
    @Column(name="DATE_OF_AQUISITION")
    private String dateOfAquisition;
    
    @Column(name="DATE")
    private Date lastControl;
    
    @Column(name="STATE_TYPE")
    private String stateType;
    
    @Column(name="PRICE")
    private double price;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getVin() {
		return vin;
	}

	public void setVin(String vin) {
		this.vin = vin;
	}

	public String getCarsType() {
		return carsType;
	}

	public void setCarsType(String carsType) {
		this.carsType = carsType;
	}

	public String getDateOfAquisition() {
		return dateOfAquisition;
	}

	public void setDateOfAquisition(String dateOfAquisition) {
		this.dateOfAquisition = dateOfAquisition;
	}

	public Date getLastControl() {
		return lastControl;
	}

	public void setLastControl(Date lastControl) {
		this.lastControl = lastControl;
	}

	public String getStateType() {
		return stateType;
	}

	public void setStateType(String stateType) {
		this.stateType = stateType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    
    
    
	
	

}
