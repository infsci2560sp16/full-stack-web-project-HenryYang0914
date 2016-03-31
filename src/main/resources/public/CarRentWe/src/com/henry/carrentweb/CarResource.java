package com.henry.carrentweb;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/cars")
public class CarResource {

	CarService carservice = new CarService();
	@Path("/XML")
	@GET
	@Produces(MediaType.APPLICATION_XML)
	public List<CarType> getCars(){
		return carservice.getAllCars();
	}
	
	@Path("/JSON")
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<CarType> get2Cars(){
	    List<CarType> car2 = new ArrayList<>();
	    car2.add(carservice.getCartype(1));
	    car2.add(carservice.getCartype(2));
	    return car2;
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public CarType addCars(CarType car){
		return carservice.addCar(car);
	}
	
}
