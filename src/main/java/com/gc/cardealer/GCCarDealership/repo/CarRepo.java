package com.gc.cardealer.GCCarDealership.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gc.cardealer.GCCarDealership.model.Car;

public interface CarRepo extends JpaRepository<Car, Integer> {

	List<Car> findByMake(String make);

	List<Car> findByModel(String model);

	List<Car> findByYear(String year);

	List<Car> findByColor(String color);

}
