package com.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import com.entity.Truck;

@Service
public class TruckServiceImpl {

	private List<Truck> Trucklist=Arrays.asList(new Truck("38","Honda","Accord","2009"),
												new Truck("39","Honda","CRV","2019"));
	
	
	public List<Truck> getAllTrucks(){
		
		return Trucklist;
	}
	
	
	
	public Truck getTruck(String vin) {
		for(Truck t : Trucklist) {
			if(vin.equals(t.getVin())) {
				return t;
			}
		}
		return null;
	}
	
	
	
	public void addTruck(Truck tr) {
		Trucklist.add(tr);
		
	}
}



	

