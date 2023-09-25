package ppt6;

import java.awt.FlowLayout;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class JFrameExam1 {

	private JFrame frame;
	
	public JFrameExam1() {
		// 1) JFrame 객체 생성
		frame = new JFrame("JFrame 생성");
		
		// 2) JFrame 위치/ 크기 설정
		frame.setSize(600, 500); //크기
		frame.setLocation(100, 200); //위치
		frame.setLayout(new FlowLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Object[][] data = {
				{"홍길동", 30, "남자"},
				{"임꺽정", 25, "여자"},
				{"장길산", 27, "남자"},
		};
		
		String[] columns = {"이름", "나이", "성별"};
		
		DefaultTableModel tableModel = new DefaultTableModel(data, columns);
		
		JTable table = new JTable(tableModel);
		//table.setEnabled(false); //화면에서 입력(수정)못하게
		
		JScrollPane scrollPane = new JScrollPane(table);
		
		frame.add(scrollPane);
		
		
		
		
		/*
		// 콤보박스
		String[] options = {"C", "C++", "Java"};
		JComboBox<String> comboBox = new JComboBox<String>(options);
		frame.add(comboBox);
		*/
		/*
		//라이오버튼
		String[] caption = {"C", "C++", "Java"};
		JRadioButton[] radio = new JRadioButton[caption.length];
		ButtonGroup radioGrp = new ButtonGroup();
			
		for(int i = 0; i < caption.length; i++) {
			radio[i] = new JRadioButton(caption[i]);
			radioGrp.add(radio[i]);
			frame.add(radio[i]);
		}
		*/
		
		/*
		//체크박스
		String[] caption = {"C", "C++", "Java"};
		JCheckBox[] chkbox = new JCheckBox[caption.length];
		
		for(int i = 0; i < caption.length; i++) {
			chkbox[i] = new JCheckBox(caption[i]);
			frame.add(chkbox[i]);
		}
		*/
		
		// 3) 윈도우가 닫힐때의 동작 정의
		
		// 4) 화면에 출력
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JFrameExam1 frame = new JFrameExam1();
		System.out.println("main end");
		
		
		
		
		
	}

}
