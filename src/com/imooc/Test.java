package com.imooc;

import java.text.BreakIterator;
import java.util.Scanner;

public class Test {
	public static void main(String[] args) {
		Car[] cars={new Passenger("奥迪A4",5,400),new Trunk("松花江",4,400),new Trunk("依维何",10,100),new Passenger("金龙",20,800),new Passenger("马自达6",4,400),new PickUp("皮卡雪6",4,450,2)};
		System.out.println("欢迎使用大大租车系统：");
		System.out.println("你是否需要租车:1是0否");
		Scanner in=new Scanner(System.in);
		int i=in.nextInt();
		if (i==1) {
			System.out.println("您可租车的类型和价格表：\n"+"序号          汽车名称        租金                                                      容量");
			System.out.println("1."+cars[0].toString());
			System.out.println("2."+cars[1].toString());
			System.out.println("3."+cars[2].toString());
			System.out.println("4."+cars[3].toString());
			System.out.println("5."+cars[4].toString());
			System.out.println("6."+cars[5].toString());
			System.out.println("请输入你要租的汽车的数量");
			int m=in.nextInt();
			Car[] currentCars=new Car[m];
			for (int k = 1; k <=m; k++) {
				System.out.println("请输入第"+k+"辆车的序号");
				int j=in.nextInt();
				currentCars[k-1]=cars[j-1];
			}
			System.out.println("请输入租车天数：");
			int day=in.nextInt();
			System.out.println("您的账单：");
			System.out.println("***可载人的车有：");
			int nPerson=0;
			int nTon=0;
			int nPrice=0;
			for (Car car : currentCars) {
				if (car instanceof Passenger) {
					nPerson+=car.getPerson();
					System.out.println(car.getName()+"");
				}
			}
			for (Car car : currentCars) {
				if (car instanceof PickUp) {
					nPerson+=car.getPerson();
					System.out.println(car.getName()+"");
				}
			}
			for (Car car : currentCars) {
				if (car instanceof Trunk) {
					nPerson+=car.getPerson();
					System.out.println(car.getName()+"");
				}
			}
			System.out.println("共载人："+nPerson+"人");
			System.out.println("*******可载货的车有：");
			for (Car car : currentCars) {
				if (car instanceof Trunk) {
					nTon+=car.getTon();
					System.out.println(car.getName()+"");
				}
			}
			for (Car car : currentCars) {
				if (car instanceof PickUp) {
					nTon+=car.getTon();
					System.out.println(car.getName()+"");
				}
			}
			System.out.println("共载货："+nTon+"吨");
			for (Car car : currentCars) {
					nPrice+=car.getPrice();
			}
			nPrice=nPrice*day;
			System.out.println("***租车总价格为："+nPrice+"元");
		}else {
			System.exit(0);
			
		}
	}
  
}
