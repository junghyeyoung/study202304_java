package test.main;

import test.mypac.Apple;
import test.mypac.FruitBox;
import test.mypac.Melon;
import test.mypac.Orange;

public class MainClass {
	public static void main(String[] args) {
		//FruitBox 객체를 생성해서 참조값을 box 라는 이름의 지역 변수에 담아 보세요.
		FruitBox<Apple> box=new FruitBox<Apple>();
		//box 에 담긴 참조값을 이용해서 pack() 메소드를 호출해 보세요.
		box.pack(new Apple());
		//box 에 담긴 참조값을 이용해서 unPack() 메소드를 호출하고 리턴되는 값을  fruit 라는 지역변수에 담아보세요
		Apple fruit=box.unPack();
		
		//여기서 생성한 박스에 Melon 을 담을수 있는지 확인해 보세요
		FruitBox<Melon> box2=new FruitBox<Melon>();
		box2.pack(new Melon());
		Melon fruit2=box2.unPack();
		
		//Orange 도 테스트 해 보세요.
		FruitBox<Orange> box3=new FruitBox<>(); //객체 생성시에 Generic 클래스는 생략 가능하다
		box3.pack(new Orange());
		Orange fruit3=box3.unPack();
	}
}









