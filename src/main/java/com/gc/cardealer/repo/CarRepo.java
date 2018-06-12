package com.gc.cardealer.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gc.cardealer.GCCarDealership.model.Car;

public interface CarRepo extends JpaRepository<Car,Integer>{
	
	List <Car> findByCategory(String Make);
	List <Car> findByModel(String Model);
	List <Car> findByYear(String Year);
	List <Car> findByColor(String Color);

}
