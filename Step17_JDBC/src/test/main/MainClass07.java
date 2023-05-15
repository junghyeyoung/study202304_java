package test.main;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Member;

public class MainClass07 {
	public static void main(String[] args) {
		//추가할 회원의 정보
		String name = "주뎅이";
		String addr = "봉천동";
		
		//아래의 메소드를 호출해서 위의 회원 정보가 DB에 저장되도록 프로그래밍 해보세요.
		//위의 정보를 Member 객체에 담아서 insert() 메소드의 매개 변수에 전달한다.
		Member m=new Member();
		m.name=name;
		m.addr=addr;
		
		MainClass07.insert(m);
	}
	
	public static void insert(Member mem) {
		//mem 에 담겨진 정보를 이용해서 회원 한명의 정보를 DB 에 저장되도록 해보세요.
		Connection conn=null;
	      
	    try {
	         //오라클 드라이버 로딩
	         Class.forName("oracle.jdbc.driver.OracleDriver");
	         //접속할 DB 의 정보 @아이피주소:port번호:db이름
	         String url="jdbc:oracle:thin:@localhost:1521:xe";
	         //계정 비밀번호를 이용해서 Connection 객체의 참조값 얻어오기
	         conn=DriverManager.getConnection(url, "scott", "tiger");
	         //예외가 발생하지 않고 여기까지 실행순서가 내려오면 접속 성공이다.
	         System.out.println("Oracle DB 접속 성공");
	     } catch (Exception e) {
	         e.printStackTrace();
	     }
	      
		    
		 PreparedStatement pstmt = null;
		 try {
		    String sql="INSERT INTO member"
		    		+ " (num, name, addr) "
		    		+ " VALUES( member_seq.NEXTVAL , ?, ?) ";
		    	
		    pstmt=conn.prepareStatement(sql);
		    pstmt.setString(1, mem.name);
		    pstmt.setString(2, mem.addr);
		    pstmt.executeUpdate();
		    System.out.println("회원 정보를 추가했습니다.");
		 }catch(Exception e) {
		    e.printStackTrace();
		 }
	}
}
