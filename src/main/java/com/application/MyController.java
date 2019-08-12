package com.application;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Import;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import com.Repository.Repository;
import com.entity.Truck;


//@Import(Repository.class)
@RestController
@RequestMapping("/Trucks")
@EntityScan("com.entity")
public class MyController {


	
	public void check() {
		System.out.println	("CHECK METH");
	}
	@Autowired
	private Repository rep;
	
	
	@RequestMapping("/all")
	public List<Truck> findAll(){
		System.out.println("VALUE ALL");
		return rep.findAll();
	}
	
	
	
	@GetMapping(value="/{vin}")
	public Truck findByVin (@PathVariable String vin){
		System.out.println("VALUE");
		return rep.findByVin(vin);
	}
	
	
	
	@PostMapping(path="/load",consumes={"application/json"})
	public Truck load(@RequestBody Truck tr) {
		rep.save(tr);
		return tr;
		//rep.findByVin(tr.getVin())
	}
	
	
	@PutMapping(path="/put",consumes={"application/json"})
	public Truck Update(@RequestBody Truck tr) {
		rep.save(tr);
		return tr;
		//rep.findByVin(tr.getVin())
	}
}
		



	/* Service LAyer implementation
	@Import(TruckServiceImpl.class)
	@Autowired
	private TruckServiceImpl tsi;
	
	@RequestMapping("/Trucks/{vin}")
	public Truck getTruck(@PathVariable String vin) {
		return tsi.getTruck(vin);
	}

	
	@RequestMapping(method=RequestMethod.POST, value="/Trucks")
	public void addTruck(@RequestBody Truck tr) {
		
		tsi.addTruck(tr);
		
	}
	*/
	

