package test.mypac;

/*
 *  클래스 안에서 사용하는 특정 type 을 고정하지 않고 
 *  
 *  클래스를 사용하는 시점에 type 을 정할수 있게 할수 있다.
 *  
 *  - 아래 선언한 T 는 마음대로 스펠링이나 단어를 정할수 있다.
 *    보통 type 이라는 의미에서 T 라고 많이 정한다. 
 *  - T 를 포괄 클래스(Generic Class) 라고 한다. 
 */

//가상의 과일 박스 
public class FruitBox<T> { // class 안에서 사용하는 data type 을 동적으로 지정할 수 있도록 하는 문법
	//필드 FruitBox<Apple> a = new FruitBox<Apple>{}
	private T item;
	
	//과일을 포장하는 메소드
	public void pack(T item) {
		this.item=item;
	}
	//과일을 리턴하는 메소드
	public T unPack() {
		return item;
	}
}










