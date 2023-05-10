package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		Car car1=new Car();
		Car car2=new Car();
		
		car1.name="쏘나타";
		car2.name="제네시스";
		
		car1.drive();
		car2.drive(); //메소드 안에서의 this는 해당사물함 번호를 지칭하는 방법이다 (예약어)
	}
}
