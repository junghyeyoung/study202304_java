package test.main2;

import java.util.Scanner;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainClass04 {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("검색할 회원번호 입력");
		
		int deptno=scan.nextInt();
		
		DeptDto dto=new DeptDao().getData(deptno);
		if(dto !=null) {
			System.out.println(deptno+" 번 회원의 이름은:"+dto.getDname()+" 주소는:"+dto.getLoc());
		}else {
			System.out.println(deptno+" 번 회원은 존재하지 않습니다!");
		}
	}
}
