package dbLogic;

import java.sql.*;

public class DBConnect {
    private static final String JDBC_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String DATABASE_URL = "jdbc:mysql://localhost/taskdb" +
            "?verifyServerCertificate=false"+
            "&useSSL=false"+
            "&requireSSL=false"+
            "&useLegacyDatetimeCode=false"+
            "&amp"+
            "&serverTimezone=UTC" +
            "&useSSL = false" +
            "&allowPublicKeyRetrieval = true" +
            "&useSSL = false";

    private static final String USER = "Nikita";
    private static final String PASSWORD = "skvezy008135";

    private Connection connection;

    public Connection getConnection() {
        return connection;
    }

    public Connection getConnect(){
        try{
            Class.forName(JDBC_DRIVER);
            connection = DriverManager.getConnection(DATABASE_URL, USER, PASSWORD);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
        return connection;
    }

    public void closeConnect(PreparedStatement prs){
        try {
            connection.close();
            prs.close();
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
}
