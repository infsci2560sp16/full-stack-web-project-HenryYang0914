package com.henry.carrentweb;
import java.util.*;;
public class CarService {

	private Map<Integer,CarType> cars = Database.getCartype();
	
	public CarService(){
		cars.put(1, new CarType(1,"Nissan",5,"SUV"));
		cars.put(2, new CarType(2,"BMW",5,"Sedan"));
	}
	public List<CarType> getAllCars(){
		return new ArrayList<CarType>(cars.values());
	}
	
	public CarType getCartype(int id){
		return cars.get(id);
	}
	
	public CarType addCar(CarType car){
		car.setId(cars.size()+1);
		cars.put(car.getId(), car);
		return car;
	}
	
	public CarType updateCar(CarType car){
		if(car.getId()<=0){
			return null;
		}
		cars.put(car.getId(), car);
		return car;
	}
	
	public CarType removeCar(int id){
		return cars.remove(id);
	}
}
