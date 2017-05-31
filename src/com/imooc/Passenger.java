package com.imooc;

public class Passenger extends Car {
	private String name;
	private int person;
	private int price;
	public Passenger(String name,int person,int price){
		this.name=name;
		this.person=person;
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public int getPerson() {
		return person;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		return name+" " +price+"元/天       "+"载人："+person;
	}
}
