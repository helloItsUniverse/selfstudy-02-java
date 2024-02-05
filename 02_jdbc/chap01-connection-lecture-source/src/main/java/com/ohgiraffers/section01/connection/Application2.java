package com.ohgiraffers.section01.connection;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

/* 수업목표. properties 파일에서 설정값을 읽어와 DB에 연결하여 사용할 수 있다. */
public class Application2 {
    public static void main(String[] args) {
        Properties prop = new Properties();
        Connection con = null;

        try {
            prop.load(
                    new FileReader("src/main/java/com/ohgiraffers/section01/connection/jdbc-config.properties"));
//            System.out.println("prop = " + prop);     // 잘 넘어오나 확인
            String driver = prop.getProperty("driver");
            String url = prop.getProperty("url");
            String user = prop.getProperty("user");
            String password = prop.getProperty("password");

            Class.forName(driver);
            con = DriverManager.getConnection(url, user, password);
            System.out.println("con = " + con);         // 커넥션이 잘 넘어오나 확인

        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            close(con);
        }
    }

    private static void close(Connection con) {
        try {
            if (con != null && !con.isClosed()) {
                con.close();
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
}
