package com.imooc;

public class Trunk extends Car {
	private String name;
	private int ton;
	private int price;
	public Trunk(String name, int ton,int price){
		this.name=name;
		this.ton=ton;
		this.price=price;
	}
	public String getName(){
		return name;
	}
	public int getTon() {
		return ton;
	}
	public int getPrice(){
		return price;
	}
	public String toString(){
		return name+" " +price+"元/天       " + "载重："+ton+"吨";
	}
}
