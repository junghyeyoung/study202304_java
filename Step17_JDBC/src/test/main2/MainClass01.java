package test.main2;

import test.dao.DeptDao;
import test.dto.DeptDto;

public class MainClass01 {
	public static void main(String[] args) {
		int deptno=50;
		String dname="해골";
		String loc="SEOUL";
		
		DeptDto dto = new DeptDto();
		dto.setDeptno(deptno);
		dto.setDname(dname);
		dto.setLoc(loc);
		
		DeptDao dao=new DeptDao();
		boolean isSuccess=dao.insert(dto);
		if(isSuccess) {
			System.out.println("저장했습니다.");
		}else {
			System.out.println("저장에 실패하였습니다.");
		}
	}
}
