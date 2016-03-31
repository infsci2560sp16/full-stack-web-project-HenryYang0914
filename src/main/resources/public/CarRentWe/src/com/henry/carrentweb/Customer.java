package com.henry.carrentweb;

public class Customer {

	private int cid;
	private String cname;
	private int liscence;
	private String address;
	
	public Customer(){
		
	}
	
	public Customer(int cid, String cname, int liscence, String address){
		this.cid = cid;
		this.cname = cname;
		this.liscence = liscence;
		this.address = address;
	}
	
	public int getCid(){
		return cid;
	}
	
	public void setCid(int cid){
		this.cid = cid;
	}
	
	public String getCname(){
		return cname;
	}
	
	public void setCname(String cname){
		this.cname = cname;
	}
	
	public int getLiscence(){
		return liscence;
	}
	
	public void setLiscence(int liscence){
		this.liscence = liscence;
	}
	
	public String getAddress(){
		return address;
	}
	
	public void setAddress(String address){
		this.address = address;
	}
}
