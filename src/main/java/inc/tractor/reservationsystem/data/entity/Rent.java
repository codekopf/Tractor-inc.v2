package inc.tractor.reservationsystem.data.entity;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;

@Entity
public class Rent {

	@Id
	@SequenceGenerator(name = "LENDING_ID_GENERATOR", sequenceName = "HIBERNATE_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "LENDING_ID_GENERATOR")
	private Long id;

	@JoinColumn(name = "VEHICLE")
	@ManyToOne
	private Vehicle vehicle;

	@Column(name = "DATE_FROM")
	private Date dateFrom;

	@Column(name = "DATE_TO")
	private Date dateTo;

	@Column(name = "PRICE")
	private BigDecimal price;

	@JoinColumn(name = "CAR_CLIENT")
	@ManyToOne
	private Client vehicleClient;

	@Column(name = "LATTITUDE")
	private Integer lattitude;

	@Column(name = "LONGITUDE")
	private Integer longitude;

	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(final Long id) {
		this.id = id;
	}

	/**
	 * @return the car
	 */
	public Vehicle getCar() {
		return vehicle;
	}

	/**
	 * @param car the car to set
	 */
	public void setVehicle(final Vehicle vehicle) {
		this.vehicle = vehicle;
	}

	/**
	 * @return the dateFrom
	 */
	public Date getDateFrom() {
		return dateFrom;
	}

	/**
	 * @param dateFrom the dateFrom to set
	 */
	public void setDateFrom(final Date dateFrom) {
		this.dateFrom = dateFrom;
	}

	/**
	 * @return the dateTo
	 */
	public Date getDateTo() {
		return dateTo;
	}

	/**
	 * @param dateTo the dateTo to set
	 */
	public void setDateTo(final Date dateTo) {
		this.dateTo = dateTo;
	}

	/**
	 * @return the price
	 */
	public BigDecimal getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(final BigDecimal price) {
		this.price = price;
	}

	/**
	 * @return the vehicleClient
	 */
	public Client getVehicleClient() {
		return vehicleClient;
	}

	/**
	 * @param carClient the vehicleClient to set
	 */
	public void setVehicleClient(final Client carClient) {
		this.vehicleClient = carClient;
	}

	/**
	 * @return the lattitude
	 */
	public Integer getLattitude() {
		return lattitude;
	}

	/**
	 * @param lattitude the lattitude to set
	 */
	public void setLattitude(final Integer lattitude) {
		this.lattitude = lattitude;
	}

	/**
	 * @return the longitude
	 */
	public Integer getLongitude() {
		return longitude;
	}

	/**
	 * @param longitude the longitude to set
	 */
	public void setLongitude(final Integer longitude) {
		this.longitude = longitude;
	}

}