package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import test.mypac.Member;

public class MainClass08 {
	public static void main(String[] args) {
		//수정할 회원의 정보라고 가정하자
		int num=1;
		String name="이정호";
		String addr="아현동";
		
		//아래의 update() 메소드를 이용해서 회원정보가 수정되도록 해보세요.
		Member mem2=new Member();
		mem2.num=num;
		mem2.name=name;
		mem2.addr=addr;
		
		MainClass08.update(mem2);
	}
	
	public static void update(Member m) {
		//Member 객체에 담긴 정보를 이용해서 회원정보를 수정하도록 해보세요.
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
	    	String sql = "UPDATE member"
	    			+ " SET name=?, addr=? "
	    			+ " WHERE num=? ";
	    	pstmt=conn.prepareStatement(sql);
	    	pstmt.setString(1, m.name);
	    	pstmt.setString(2, m.addr);
	    	pstmt.setInt(3, m.num);
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 수정했습니다.");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}
