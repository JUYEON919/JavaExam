package ppt6;

import java.sql.*;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class LoginApp {
    private JFrame frame;
    private JTextField textFieldUsername;
    private JPasswordField passwordField;
    private JButton loginButton;

    public LoginApp() {
        frame = new JFrame("로그인 화면"); // 로그인 화면 프레임 생성
        frame.setSize(300, 150); // 프레임 크기 설정
        frame.setLocationRelativeTo(null); // 화면 중앙에 위치
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // 창 닫기 설정
        frame.setLayout(new GridBagLayout()); // 그리드백 레이아웃 설정

        GridBagConstraints gbc = new GridBagConstraints();
        gbc.insets = new Insets(5, 5, 5, 5); // 컴포넌트 간 여백 설정

        // ID 레이블과 텍스트 필드 추가
        JLabel labelUsername = new JLabel("ID:");
        gbc.gridx = 0; // 그리드 X 위치
        gbc.gridy = 0; // 그리드 Y 위치
        frame.add(labelUsername, gbc); // 프레임에 추가

        textFieldUsername = new JTextField(10); // 텍스트 필드 생성 및 길이 설정
        gbc.gridx = 1;
        gbc.gridy = 0;
        frame.add(textFieldUsername, gbc);

        // PW 레이블과 패스워드 필드 추가
        JLabel labelPassword = new JLabel("PW:");
        gbc.gridx = 0;
        gbc.gridy = 1;
        frame.add(labelPassword, gbc);

        passwordField = new JPasswordField(10); // 패스워드 필드 생성 및 길이 설정
        gbc.gridx = 1;
        gbc.gridy = 1;
        frame.add(passwordField, gbc);

        // 로그인 버튼 추가
        loginButton = new JButton("로그인");
        gbc.gridx = 0;
        gbc.gridy = 2;
        gbc.gridwidth = 2; // 로그인 버튼이 두 칸에 걸쳐 표시되도록 설정
        frame.add(loginButton, gbc);

        // 로그인 버튼 클릭 이벤트 처리
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = textFieldUsername.getText(); // 입력한 ID
                String password = new String(passwordField.getPassword()); // 입력한 패스워드

                // 사용자 인증 메서드 호출
                if (authenticateUser(username, password)) {
                	showMessage("로그인 성공!", Color.BLUE, Color.WHITE);
                    //JOptionPane.showMessageDialog(frame, "로그인 성공!"); // 로그인 성공 메시지
                } else {
                	showMessage("로그인 실패!", Color.RED, Color.WHITE);
                	// JOptionPane.showMessageDialog(frame, "로그인 실패!"); // 로그인 실패 메시지
                }
            }
        });

        frame.setVisible(true); // 프레임을 보이도록 설정
        
        
    }
    
    //성공실패메세지창꾸미기~
    private void showMessage(String message, Color backgroundColor, Color textColor) {
        JLabel messageLabel = new JLabel(message);
        messageLabel.setHorizontalAlignment(JLabel.CENTER);
        messageLabel.setFont(new Font("D2_coding" ,Font.BOLD, 40));
        
        // 메시지 레이블의 배경색과 글자색 설정
        messageLabel.setOpaque(true);
        messageLabel.setBackground(backgroundColor);
        messageLabel.setForeground(textColor);

        JOptionPane.showMessageDialog(frame, messageLabel, "로그인 결과", JOptionPane.PLAIN_MESSAGE);
    }
    

    // 사용자 인증 메서드
    private boolean authenticateUser(String username, String password) {
        String dbUrl = "jdbc:mysql://192.168.70.128:3306/employees"; // 데이터베이스 연결 URL
        String dbUser = "mariadb"; // 데이터베이스 사용자 이름
        String dbPassword = "1234"; // 데이터베이스 비밀번호

        try (Connection conn = DriverManager.getConnection(dbUrl, dbUser, dbPassword)) {
            String sql = "SELECT * FROM users WHERE user_id = ? AND user_pw = ?"; // SQL 쿼리
            try (PreparedStatement stmt = conn.prepareStatement(sql)) {
                stmt.setString(1, username); // 첫 번째 매개변수 설정 (사용자 ID)
                stmt.setString(2, password); // 두 번째 매개변수 설정 (사용자 패스워드)
                try (ResultSet rs = stmt.executeQuery()) {
                    return rs.next(); // 결과가 존재하면 로그인 성공
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return false; // DB 연동 실패 또는 일치하는 사용자 없음
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new LoginApp(); // 프로그램 실행
            }
        });
    }
}
