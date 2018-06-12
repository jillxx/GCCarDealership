package com.gc.cardealer.GCCarDealership;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.gc.cardealer.GCCarDealership.model.Car;

@Controller
public class HomeController {
	
	@RequestMapping("/")
	public ModelAndView index() {
		return new ModelAndView("index");
	}
	
	@RequestMapping("makeresults")
	public ModelAndView makeresults(@RequestParam("make") String m) {
		RestTemplate restTemplate = new RestTemplate();
		
		Car make = restTemplate.getForObject("http://localhost:8080/make?make="+ m, Car.class);
		return new ModelAndView("makeresults", "car", make);
	}


}
