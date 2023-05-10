package test.main;

import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.MacBook;
import test.mypac.Memory;

public class MainClass03 {
	public static void main(String[] args) {
		/*
		 *  MacBook 객체를 생성해서 참조값을 mac1 이라는 지역 변수에 담아 보세요.
		 *  
		 *  주의!!
		 *  - MacBook 클래스를 절대 수정하지 마세요.
		 *  - MainClass03 은 test.main 패키지에 있고
		 *    Cpu, Memory, HardDisk, MacBook 클래스는 test.mypac 패키지에 있기 때문에
		 *    4개의 클래스 모두 import 되어야 한다.
		 *  
		 */
		MacBook mac1=new MacBook(new Cpu(),new Memory(),new HardDisk());
		
		MacBook mac2=new MacBook(null,null,null);
		
		mac1.doGame();
		mac2.doGame();
		
		Cpu c=new Cpu();
		Memory m=new Memory();
		HardDisk h=new HardDisk();
		// 생성자의 인자로 전달할 값이 지역변수에 있는 경우 지역변수를 참조해서 전달할 수도 있다.
		MacBook mac3=new MacBook(c,m,h);
		
		mac3.doGame();
	}
}
