package test.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class MainClass06 {
	public static void main(String[] args) {
		//시퀀스(member_seq)를 이용해서 회원정보 추가
		String name = "원숭이";
		String addr = "상도동";
		//DB 연결객체를 담을 지역 변수 만들기
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
	    // 4번 회원을 삭제해 보세요.
	    int num = 4;
	    
	    PreparedStatement pstmt = null;
	    try {
	    	String sql="INSERT INTO member"
	    			+ " (num, name, addr) "
	    			+ " VALUES( member_seq.NEXTVAL , ?, ?) ";
	    	
	    	pstmt=conn.prepareStatement(sql);
	    	pstmt.setString(1, name);
	    	pstmt.setString(2, addr);
	    	
	    	pstmt.executeUpdate();
	    	System.out.println("회원 정보를 저장했습니다.");
	    }catch(Exception e) {
	    	e.printStackTrace();
	    }
	}
}
