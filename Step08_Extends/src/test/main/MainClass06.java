package test.main;

import test.mypac.AndroidPhone;
import test.mypac.HandPhone;

public class MainClass06 {
	public static void main(String[] args) {
		// 자식에게 사준 일반 핸드폰(인터넷이 안됌)
		HandPhone p1=new HandPhone();
		
		// 엄마 ! 나도 AndroidPhone 갖고 싶어 !
		AndroidPhone p2 = (AndroidPhone)p1; // ClasscastException 발생 !
		
		p2.doInternet();
	}
}
