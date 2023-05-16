package test.main2;

import test.dao.DeptDao;

public class MainClass02 {
	public static void main(String[] args) {
		int deptno=0;
		
		boolean isSuccess=new DeptDao().delete(deptno);
		
		if(isSuccess) {
			System.out.println("삭제 했습니다.");
		}
	}
}
