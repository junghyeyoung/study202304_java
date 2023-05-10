package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		//Car 객체를 생성해서 참조값을 Car type 지역변수 car1 에 담기
		Car car1=new Car();
		//car1 에 담긴 참조값을 Car type 지역 변수 car2 에 복사해 주기
		Car car2=car1;
		//Car type 의 참조값을 담을 수 있는 지역변수 car3 만들기
		Car car3=null;
		
		car1.name="아반떼";
		String a=car1.name;
		String b=car2.name;
		
		car1.drive();
		car2.drive();
		//nullpointerexception 발생
		car3.drive(); //참조값(null)이 없어서 오류가 뜬다
	}

}
