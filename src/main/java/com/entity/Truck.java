package com.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="users")

public class Truck {

	@Id
	@Column(name="vin")
	private String vin;
	
	@Column(name="make")
	private String make;
	
	@Column(name="model")
	private String model;
	
	@Column(name="year")
	private String year;
	
	
	@Column(name="red_line_rpm")
	String redLineRPM;
	
	@Column(name="max_fuel_volume")
	String maxFuelVolume;
	
	@Column(name="last_service_date")
	String LastServiceDate;
	
	@Column(name="latitude")
	String latitude;
	
	@Column(name="longitude")
	String longitude;
	
	@Column(name="time_stamp")
	String timeStamp;
	
	@Column(name="fuel_volume")
	String fuelVolume;
	
	@Column(name="speed")
	String speed;
	
	@Column(name="enginehp")
	String engineHP;
	
	@Column(name="check_engine_light_on")
	String checkEngineLightOn;
	
	@Column(name="engine_coolant_low")
	String EngineCoolantLow;
	
	@Column(name="cruise_control_on")
	String CruiseControlOn;
	
	@Column(name="enginerpm")
	String engineRPM;
	
	@Column(name="tyres")
	String tyres;
	
	
	/*@OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "attach_vin", referencedColumnName = "vin")
	private Attach attach;*/
	
	public Truck(String vin, String make, String model, String year) {
		super();
		this.vin = vin;
		this.make = make;
		this.model = model;
		this.year = year;
	}
	

	@GeneratedValue
	public String getVin() {
		return vin;
	}
	public void setVin(String vin) {
		this.vin = vin;
	}
	
	
	/*public  Truck() {
		this.vin = UUID.randomUUID()
                .toString();
	}
	*/
	public String getMake() {
		return make;
	}
	public void setMake(String make) {
		this.make = make;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	
	
	
	public String getRedLineRPM() {
		return redLineRPM;
	}


	public void setRedLineRPM(String redLineRPM) {
		this.redLineRPM = redLineRPM;
	}


	public String getMaxFuelVolume() {
		return maxFuelVolume;
	}


	public void setMaxFuelVolume(String maxFuelVolume) {
		this.maxFuelVolume = maxFuelVolume;
	}


	public String getLastServiceDate() {
		return LastServiceDate;
	}


	public void setLastServiceDate(String lastServiceDate) {
		LastServiceDate = lastServiceDate;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getTimeStamp() {
		return timeStamp;
	}


	public void setTimeStamp(String timeStamp) {
		this.timeStamp = timeStamp;
	}


	public String getFuelVolume() {
		return fuelVolume;
	}


	public void setFuelVolume(String fuelVolume) {
		this.fuelVolume = fuelVolume;
	}


	public String getSpeed() {
		return speed;
	}


	public void setSpeed(String speed) {
		this.speed = speed;
	}


	public String getEngineHP() {
		return engineHP;
	}


	public void setEngineHP(String engineHP) {
		this.engineHP = engineHP;
	}


	public String getCheckEngineLightOn() {
		return checkEngineLightOn;
	}


	public void setCheckEngineLightOn(String checkEngineLightOn) {
		this.checkEngineLightOn = checkEngineLightOn;
	}


	public String getEngineCoolantLow() {
		return EngineCoolantLow;
	}


	public void setEngineCoolantLow(String engineCoolantLow) {
		EngineCoolantLow = engineCoolantLow;
	}


	public String getCruiseControlOn() {
		return CruiseControlOn;
	}


	public void setCruiseControlOn(String cruiseControlOn) {
		CruiseControlOn = cruiseControlOn;
	}


	public String getEngineRPM() {
		return engineRPM;
	}


	public void setEngineRPM(String engineRPM) {
		this.engineRPM = engineRPM;
	}


	public String getTyres() {
		return tyres;
	}


	public void setTyres(String tyres) {
		this.tyres = tyres;
	}


	public Truck() {
		
	}


	@Override
	public String toString() {
		return "Truck [vin=" + vin + ", make=" + make + ", model=" + model + ", year=" + year + ", redLineRPM="
				+ redLineRPM + ", maxFuelVolume=" + maxFuelVolume + ", LastServiceDate=" + LastServiceDate + "]";
	}


	
	

	
	
	
	
	
}
