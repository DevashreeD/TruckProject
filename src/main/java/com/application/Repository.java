package com.application;

import javax.management.loading.ClassLoaderRepository;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import com.entity.Truck;


@SuppressWarnings("unused")
@Component
public interface Repository extends JpaRepository<Truck,String>{

   Truck findByVin(String vin);
}


