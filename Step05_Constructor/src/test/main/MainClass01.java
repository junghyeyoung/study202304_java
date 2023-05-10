package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		new Student(); // 버려진 함수
		
		new Student().study(); // 한번 호출된 함수
		
		Student s1=new Student(); // 여러번 사용하려면 변수에 담으면 된다.
		s1.study();
		s1.study();
	}

}
