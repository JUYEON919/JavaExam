package ppt6;

import java.sql.*;

public class DBConnTest {

	public static void main(String[] args) {
		String dbUrl = "jdbc:mysql://192.168.70.128:3306/employees"; //192.168.70.128내아이피
		String user = "mariadb"; //유저명
		String password = "1234"; //마리아디비유저비번
		Connection conn = null;
		
		
		try {
			//데이터베이스접속
			 conn = DriverManager.getConnection(dbUrl, user, password);
			 conn.setAutoCommit(false);
			
			System.out.println("DB접속 성공");
			
			//쿼리 실행 객체(Statement)생성
			//Statement stmt = conn.createStatement();
			
//			//d010삭제
//			String sql = "DELETE from departments where dept_no = ?";
//			PreparedStatement preStmt = conn.prepareStatement(sql);
//			preStmt.setString( 1, "d010");
			
			
//			//d010 /Test // insert ? 활용해서
			String dept_no="d007";
			String dept_name = "Sales";
			
			String sql = "insert into departments (dept_no, dept_name) value(?,?)";
			PreparedStatement preStmt = conn.prepareStatement(sql);
			preStmt.setString( 1, dept_no);
			preStmt.setString( 2, dept_name);

			
			
//			//UPDATE문 /BIG_Sales-> Sales //Sales->BIG_Sales
//			//조건을 넘버로
//			//String sql = "update departments set dept_name = concat('BIG_', dept_name) where dept_no = ?";
//			String sql = "update departments set dept_name = replace('BIG_', dept_name) where dept_no = 'd007'";
//			PreparedStatement preStmt = conn.prepareStatement(sql);
//			//preStmt.setString(1, "d007");
			
			
			
			// SELECT 쿼리문
			int sccessRows = preStmt.executeUpdate();
			
			if(sccessRows > 0) {
				System.out.println(sccessRows + "건 수정 완료");
				conn.commit();
			}else {
				System.out.println("수정 대상 없음");
			}
		
		} catch (SQLException e) {
				try {
					conn.rollback();
				}catch (SQLException e1) {
					e1.printStackTrace();
				}
		}
		
		
	}//main

}//DBConnTest
