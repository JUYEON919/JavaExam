package ppt6;

import java.awt.FlowLayout;
import javax.swing.*;
import javax.swing.JButton;
import javax.swing.JFrame;

public class JFrameExam1 {

	private JFrame frame;
	
	public JFrameExam1() {
		// 1) JFrame 객체 생성
		frame = new JFrame("JFrame 생성");
		
		// 2) JFrame 위치/ 크기 설정
		frame.setSize(600, 400); //크기
		frame.setLocation(100, 200); //위치
		frame.setLayout(new FlowLayout(FlowLayout.LEFT)); //버튼
		
		JMenuBar menuBar = new JMenuBar();
		
		JMenu fileMenu = new JMenu("파일(F)");	
		
		JMenuItem newItem = new JMenuItem("새로만들기(N)");	
		JMenuItem windowItem = new JMenuItem("새창(P)");
		JMenuItem openItem = new JMenuItem("열기(O)");
		JMenuItem saveItem = new JMenuItem("저장(S)");
		
		fileMenu.add(newItem);
		fileMenu.add(windowItem);
		fileMenu.add(openItem);
		fileMenu.addSeparator(); //구분선
		fileMenu.add(saveItem);
		
		
		JMenu editMenu = new JMenu("폅집(E)");
		JMenu formatMenu = new JMenu("서식(O)");
		JMenu viewMenu = new JMenu("보기(V)");
		JMenu helpMenu = new JMenu("도움말(H)");
		
		menuBar.add(fileMenu);
		menuBar.add(editMenu);
		menuBar.add(formatMenu);
		menuBar.add(viewMenu);
		menuBar.add(helpMenu);
		
		frame.setJMenuBar(menuBar);
		
		JLabel label = new JLabel("JLabel");
		frame.add(label);
		
		JTextField textField = new JTextField("JTextField");
		frame.add(textField);
		
		JTextArea textArea = new JTextArea("JTextArea");
		frame.add(textArea);
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		// 3) 윈도우가 닫힐때의 동작 정의
		
		
		
		
		// 4) 화면에 출력
		frame.setVisible(true);
		
	}
	
	public static void main(String[] args) {
		JFrameExam1 frame = new JFrameExam1();
		System.out.println("main end");
		
		
		
		
		
	}

}
