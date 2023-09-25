package ppt6;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class LoginFrame extends JFrame {
    private JTextField usernameField;
    private JPasswordField passwordField;

    public LoginFrame() {
        setTitle("로그인");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // GridBagLayout 사용
        setLayout(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // 여백 설정
     // "Log in" 레이블 추가
        JLabel loginLabel = new JLabel("Log in");
        
        JLabel usernameLabel = new JLabel("ID:");
        usernameField = new JTextField(20); // 텍스트 필드 길이 설정

        JLabel passwordLabel = new JLabel("PW:");
        passwordField = new JPasswordField(20); // 비밀번호 필드 길이 설정

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

                // 로그인 시도 후 필드 초기화
                usernameField.setText("");
                passwordField.setText("");
            }
        });

       
        //setLocationRelativeTo(null); // 화면 중앙에 표시
        setVisible(true);
    }

    private boolean isValidLogin(String username, String password) {
        return username.equals("han") && password.equals("12345");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginFrame();
            }
        });
    }
}
