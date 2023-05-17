package test.frame;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import test.dao.MemberDao;
import test.dto.MemberDto;

public class Practice extends JFrame{
	
	JTextField inputMsg1, inputMsg2, inputMsg3;
	JButton updateBtn,insertBtn, deleteBtn, listBtn, dataBtn;
	DefaultTableModel model;
	
	public Practice(String title) {
		super(title);
		
		setLayout(new BorderLayout());
		
		JLabel label1=new JLabel("번호");
		inputMsg1=new JTextField(10);
		
		JLabel label2=new JLabel("이름");
		inputMsg2=new JTextField(10);
		
		JLabel label3=new JLabel("주소");
		inputMsg3=new JTextField(10);
		
		updateBtn=new JButton("정보수정");
		insertBtn=new JButton("정보추가");
		deleteBtn=new JButton("정보삭제");
		listBtn=new JButton("목록 불러오기");
		dataBtn=new JButton("정보검색");
		
		
		JPanel panel=new JPanel();
		panel.add(label1);
		panel.add(inputMsg1);
		panel.add(label2);
		panel.add(inputMsg2);
		panel.add(label3);
		panel.add(inputMsg3);
		panel.add(updateBtn);
		panel.add(insertBtn);
		panel.add(deleteBtn);
		panel.add(listBtn);
		panel.add(dataBtn);
		
		add(panel, BorderLayout.NORTH);
		panel.setBackground(Color.WHITE);
		
		JTable table=new JTable();
		
		String[] colNames= {"번호", "이름", "주소"};
		model=new DefaultTableModel(colNames, 0);
		table.setModel(model);
		JScrollPane scroll=new JScrollPane(table);
		add(scroll, BorderLayout.CENTER);
		
		updateBtn.addActionListener((e)->{
			int num=Integer.parseInt(inputMsg1.getText());
			String name=inputMsg2.getText();
			String addr=inputMsg3.getText();
			
			MemberDto dto=new MemberDto(num,name,addr);
			boolean isSuccess=new MemberDao().update(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "수정되었습니다.");
				System.out.println("저장되었습니다");
				List<MemberDto> list=new MemberDao().getList();
				model.setRowCount(0);
				
				for(MemberDto tmp:list) {
					Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
					model.addRow(row);
				}
			}else {
				System.out.println("실패했습니다.");
			}
		});
		
		insertBtn.addActionListener((e)->{
			String name=inputMsg2.getText();
			String addr=inputMsg3.getText();
			
			MemberDto dto=new MemberDto();
			dto.setName(name);
			dto.setAddr(addr);
			
			MemberDao dao=new MemberDao();
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "추가되었습니다");
				System.out.println("저장되었습니다");
				List<MemberDto> list=new MemberDao().getList();
				model.setRowCount(0);
				
				for(MemberDto tmp:list) {
					Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
					model.addRow(row);
				}
			}else {
				System.out.println("실패했습니다.");
			}
		});
		
		deleteBtn.addActionListener((e)->{
			int num=Integer.parseInt(inputMsg1.getText());
			
			boolean isSuccess=new MemberDao().delete(num);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "삭제되었습니다");
				System.out.println("삭제되었습니다");
				List<MemberDto> list=new MemberDao().getList();
				model.setRowCount(0);
				
				for(MemberDto tmp:list) {
					Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
					model.addRow(row);
				}
			}else {
				System.out.println("실패했습니다.");
			}
		});
		
		listBtn.addActionListener((e)->{
			List<MemberDto> list=new MemberDao().getList();
			model.setRowCount(0);
			for(MemberDto tmp:list) {
				Object[] row= {tmp.getNum(), tmp.getName(), tmp.getAddr()};
				model.addRow(row);
			}
		});
		
		dataBtn.addActionListener((e)->{
			int num=Integer.parseInt(inputMsg1.getText());
			MemberDto dto=new MemberDao().getData(num);
			model.setRowCount(0);
			
			if(dto !=null) {
				Object[] row= {num,dto.getName(),dto.getAddr()};
				model.addRow(row);
			}else {
				JOptionPane.showMessageDialog(this, num+" 번 회원은 존재하지 않습니다!");
			}
		});
	}
	public static void main(String[] args) {
		Practice p=new Practice("정보검색창");
		p.setDefaultCloseOperation(EXIT_ON_CLOSE);
		p.setBounds(100, 100, 1000, 500);
		p.setVisible(true);
	}
}
