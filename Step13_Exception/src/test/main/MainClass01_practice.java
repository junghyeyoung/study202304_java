package test.main;

import java.util.Scanner;

public class MainClass01_practice {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("숫자입력: ");
		String inputNum=scan.nextLine();
		
		try {
		double num=Double.parseDouble(inputNum);
		double result=num+100;
		System.out.println("입력한 숫자 + 100 : "+result);
		}catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
		System.out.println("main 메소드 종료");
	}
}
