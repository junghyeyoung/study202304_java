package test.main2;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainClass03 {
	public static void main(String[] args) {
		int deptno=50;
		String dname="김구라";
		String loc="BUSAN";
		
		DeptDto dto=new DeptDto(deptno, dname, loc);
		
		boolean isSuccess=new DeptDao().update(dto);
		if(isSuccess) {
			System.out.println("수정되었습니다.");
		}
	}
}
