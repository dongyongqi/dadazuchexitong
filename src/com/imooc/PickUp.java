package com.imooc;

public class PickUp extends Car {
	private String name;
	private int ton;
	private int person;
	private int price;
 public PickUp(String name,int person,int price,int ton){
		this.name=name;
		this.person=person;
		this.price=price;
		this.ton=ton;
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
	public int getTon() {
		return ton;
	}
	public String toString(){
		return name+" " +price+"元/天       "+"载人："+person + "载重："+ton+"吨";
	}
}
