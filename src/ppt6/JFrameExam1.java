package ppt6;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class JFrameExam1 {

	private JFrame frame;
	
	public JFrameExam1() {
		// 1) JFrame 객체 생성
		frame = new JFrame("JFrame 생성");
		
		// 2) JFrame 위치/ 크기 설정
		frame.setSize(600, 500); //크기
		frame.setLocation(100, 200); //위치
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLayout(new GridLayout(4,2));
		
		ListenerExam listener = new ListenerExam();
		
		for(int i = 1; i <= 8; i++) {
			JButton	button = new JButton("Button" + i);
			//button.addActionListener(listener);//(익명객체오게만들기)
			button.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    String actionCommand = e.getActionCommand();
                    if (actionCommand.equals("Button1")) {
                        System.out.println("로그인 처리 호출");
                    }
                }
            });
			frame.add(button);
		}

		frame.setVisible(true);
		
		
	}//public JFrameExam1
	
	public static void main(String[] args) {
		JFrameExam1 frame = new JFrameExam1();
		System.out.println("main end");
		
		
	}//main

}//class JFrameExam1
