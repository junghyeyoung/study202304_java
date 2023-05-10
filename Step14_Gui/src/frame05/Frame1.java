package frame05;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class Frame1 extends JFrame implements ActionListener {
	public Frame1(String title) {
		super(title);
		this.setBounds(100, 100, 500, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new FlowLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn);
		
		sendBtn.addActionListener((e)->{
			System.out.println("전송버튼이 클릭되었습니다.");
			JOptionPane.showMessageDialog(this, "전송합니다.");
		});
		
		JButton deleteBtn=new JButton("삭제");
		add(deleteBtn);
		

		deleteBtn.addActionListener((e)->{
			System.out.println("삭제버튼이 클릭되었습니다.");
			JOptionPane.showConfirmDialog(this, "삭제합니다.");
		});
		
		JButton updateBtn=new JButton("수정");
		add(updateBtn);
		
		ActionListener listener1 = new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				ActionListener A = this;
				System.out.println("수정버튼이 클릭되었습니다.");
				JOptionPane.showConfirmDialog(Frame1.this, "수정합니다.");
			}
		};
		updateBtn.addActionListener(listener1);
		
		JButton addBtn=new JButton("추가");
		add(addBtn);
		
		addBtn.addActionListener(this);
		
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new Frame1("나의 프레임");
		System.out.println("main 메소드가 종료됩니다.");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("추가버튼이 클릭되었습니다.");
		JOptionPane.showConfirmDialog(this, "추가합니다.");
		
	}
}
