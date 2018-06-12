package com.gc.cardealer.GCCarDealership;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.gc.cardealer.GCCarDealership.model.Car;
import com.gc.cardealer.GCCarDealership.repo.CarRepo;

@RestController
public class CarController {

	@Autowired
	CarRepo cR;

	@GetMapping("/make")
	public List<Car> make(@RequestParam("make") String make) {
		
		
		List<Car> carListByMake = new ArrayList<>();
		
		carListByMake = cR.findByMake(make);
		return carListByMake;
		
	}
	
	@GetMapping("/model")
	public List<Car> model(@RequestParam("model") String model) {
		List<Car> carListByModel = new ArrayList<>();
		carListByModel = cR.findByModel(model);
		return carListByModel;
		
	}
	@GetMapping("/year")
	public List<Car> year(@RequestParam("year") String year) {
		List<Car> carListByYear = new ArrayList<>();
		carListByYear = cR.findByYear(year);
		return carListByYear;
		
	}
	@GetMapping("/color")
	public List<Car> color(@RequestParam("color") String color) {
		List<Car> carListByColor = new ArrayList<>();
		carListByColor = cR.findByColor(color);
		return carListByColor;
		
	}

}
