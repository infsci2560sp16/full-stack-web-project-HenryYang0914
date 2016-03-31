package com.henry.carrentweb;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class CarType {

	private int id;
	private String name;
	private int space;
	private String kind;
	
	public CarType(){
		
	}
	
	public CarType(int id, String name, int space, String kind){
		this.id = id;
		this.name = name;
		this.space = space;
		this.kind = kind;
	}
	
	public int getId(){
		return id;
	}
	
	public void setId(int id){
		this.id = id;
	}
	
	public String getName(){
		return name;
	}
	
	public void setName(String name){
		this.name = name;
	}
	
	public int getSpace(){
		return space;
	}
	
	public void setSpace(int space){
		this.space = space;
	}
	
	public String getKind(){
		return kind;
	}
	
	public void setKind(String kind){
		this.kind = kind;
	}
}
