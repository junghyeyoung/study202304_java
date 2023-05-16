package test.main;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class MainClass14 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num=1;
		String name="김구라";
		String addr="독산동";
		
		
		//위의 정보를 이용해서 1번 회원의 정보를 수정하고 성공이면 "수정했습니다" 가 출력 되도록 해보세요.
		/*
		MemberDto dto=new MemberDto();
		dto.setNum(num);
		dto.setName(name);
		dto.setAddr(addr);
		*/
		//생성자의 인자로 회원정보를 전달해서 객체를 생성 할 수도 있다.
		MemberDto dto=new MemberDto(num,name,addr);
		
		//MemberDao 객체를 생성해서 update() 메소드를 이용해서 수정하고 성공여부 리턴받기
		boolean isSuccess=new MemberDao().update(dto);
		if(isSuccess) {
			System.out.println("수정했습니다.");
		}
	}
}
