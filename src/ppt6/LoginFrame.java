package ppt6;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginFrame extends JFrame {

    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        // 프레임 설정
        setTitle("로그인");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null); // 화면 중앙에 위치

        // 패널 생성
        JPanel panel = new JPanel(new GridLayout(3, 2));

        // Log in 레이블 추가
        JLabel loginLabel = new JLabel("Log in", JLabel.CENTER);
        panel.add(loginLabel);
        panel.add(new JLabel()); // 공백 추가

        // ID 레이블 및 입력 필드 추가
        JLabel usernameLabel = new JLabel("ID :", JLabel.CENTER);
        usernameField = new JTextField();
        panel.add(usernameLabel);
        panel.add(usernameField);

        // PW 레이블 및 입력 필드 추가
        JLabel passwordLabel = new JLabel("PW :", JLabel.CENTER);
        passwordField = new JPasswordField();
        panel.add(passwordLabel);
        panel.add(passwordField);

        // 로그인 버튼 추가
        JButton loginButton = new JButton("로그인");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
            	String username = usernameField.getText();
                char[] passwordChars = passwordField.getPassword();
                String password = new String(passwordChars);

                if (isValidLogin(username, password)) {
                    JOptionPane.showMessageDialog(LoginFrame.this, "로그인 성공!");
                } else {
                    JOptionPane.showMessageDialog(LoginFrame.this, "로그인 실패. 올바른 사용자 이름과 비밀번호를 입력하세요.");
                }

            }
        });

        // 로그인 버튼을 가운데 정렬
        JPanel buttonPanel = new JPanel(new FlowLayout(FlowLayout.CENTER));
        buttonPanel.add(loginButton);

        // 프레임에 패널과 버튼 패널 추가
        add(panel, BorderLayout.CENTER);
        add(buttonPanel, BorderLayout.SOUTH);

        // 화면에 표시
        setVisible(true);
        
        
    }
    private boolean isValidLogin(String username, String password) {
        return username.equals("han") && password.equals("12345");
    }
    public static void main(String[] args) {
    	LoginFrame frame = new LoginFrame();
		System.out.println("main end");
    }
}
