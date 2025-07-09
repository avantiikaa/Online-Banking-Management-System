import java.sql.*;

public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/onlinebank",
                "root", "your_mysql_password");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }
}
