package com.ohgiraffers.section01.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/* 수업목표. 해당 DBMS와 계정에 맞는 Connection 객체를 생성할 수 있다.(feat. DBMS Driver 추가) */
public class Application1 {
    public static void main(String[] args) {
        Connection con = null;

        try {
            // 드라이버를 인식
            Class.forName("com.mysql.cj.jdbc.Driver");

            // 통로를 생성
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "swcamp", "swcamp");
            // 쿼리를 싣고 나르는 트럭이 지나다닐 통로

            System.out.println("con = " + con);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            try {
                if (con != null && !con.isClosed()) con.close();
            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
