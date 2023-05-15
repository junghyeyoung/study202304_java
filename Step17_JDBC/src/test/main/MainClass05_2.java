package test.main;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MainClass05_2 extends JFrame implements ActionListener{
	JTextField tf_num1, tf_num2, tf_num3;
	JButton sendBtn;
	public MainClass05_2(String title) {
		super(title);
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		
		tf_num1 = new JTextField(10);
		tf_num2 = new JTextField(10);
		tf_num3 = new JTextField(10);
		sendBtn = new JButton("전송");

		
		add(tf_num1);
		add(tf_num2);
		add(tf_num3);
		add(sendBtn);
		
		sendBtn.addActionListener(this);
		sendBtn.setActionCommand("send");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new MainClass05_2("DB에 정보보내기");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String num=tf_num1.getText();
		String name=tf_num2.getText();
		String addr=tf_num3.getText();
		
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
	    } catch (Exception e2) {
	    	e2.printStackTrace();
	    }
		
		PreparedStatement pstmt = null;
		try {
			String sql="INSERT INTO member"
					+ " (num, name, addr) "
					+ " VALUES(?, ?, ?) ";
			pstmt=conn.prepareStatement(sql);
			pstmt.setString(1, num);
			pstmt.setString(2, name);
			pstmt.setString(3, addr);
			pstmt.executeUpdate();
			System.out.println("회원 정보를 저장했습니다.");
			JOptionPane.showMessageDialog(this, "DB에 저장되었습니다.");
		}catch(Exception e3) {
			e3.printStackTrace();
		}
	}
}
