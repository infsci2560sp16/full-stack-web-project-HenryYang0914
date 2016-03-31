package com.henry.carrentweb;

import java.util.HashMap;
import java.util.Map;

public class Database {

	private static Map<Integer,CarType> cartype = new HashMap<>();
	private static Map<Integer,Customer> customer = new HashMap<>();
	
	public static Map<Integer,CarType> getCartype(){
		return cartype;
	}
	
	public static Map<Integer,Customer> getCustomer(){
		return customer;
	}
}
