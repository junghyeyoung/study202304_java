package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.dto.MemberDto;
import test.util.DBConnect;

public class MainClass10 {
	public static void main(String[] args) {
		//수정할 회원의 정보
		int num =1;
		String name ="호빵";
		String addr ="독산동";
		
		//MemberDto 객체를 생성해서
		MemberDto dto1=new MemberDto();
		//수정할 회원의 정보를 담고
		dto1.setNum(num);
		dto1.setName(name);
		dto1.setAddr(addr);
		//update() 메소드의 매개변수에 전달해서 회원정보가 수정되도록 한다.
		update(dto1);
	}
	
	public static void update(MemberDto dto) {
		//Member 객체에 담긴 정보를 이용해서 회원 정보를 수정
		
		//sql문을 대신 실행해줄 객체의 참조값을 담을 지역변수 미리 만들기
	    Connection conn=null;
	    PreparedStatement pstmt = null;      
	    try {
	    	//connection 객체의 참조값 얻어오기
	    	conn=new DBConnect().getConn();
	    	//실행할 미완성의 sql 문
	    	String sql = "UPDATE member"
	    			+ " SET name=?, addr=? "
	    			+ " WHERE num=? ";
	    	pstmt=conn.prepareStatement(sql);
	    	pstmt.setString(1, dto.getName());
	    	pstmt.setString(2, dto.getAddr());
	    	pstmt.setInt(3, dto.getNum());
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 수정했습니다.");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
		
	}
}
