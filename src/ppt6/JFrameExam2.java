package ppt6;

import javax.swing.JFrame;

public class JFrameExam2 extends JFrame {
	
	public JFrameExam2() {
		
		// 부모의 생성자 호출(타이틀 설정)
		super("JFrame 상속");
		setBounds(100,200,600,400);
		
		// 윈도우(JFrame)이 닫힐때의 동작 정의
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 화면에 출력
		setVisible(true);
	}

	public static void main(String[] args) {
		JFrameExam2 frame = new JFrameExam2();
		System.out.println("main End");
	}

}