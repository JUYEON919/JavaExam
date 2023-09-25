package ppt6;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ListenerExam implements ActionListener {

	@Override
	public void actionPerformed(ActionEvent e) {
		String actionCommand = e.getActionCommand();
		if(actionCommand.equals("Button 1")) {
			System.out.println("로그인 처리 호출");
		}
	}

}
