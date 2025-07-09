import java.sql.*;

public class Login {
    public boolean authenticate(String accountNumber, String password) {
        boolean isValid = false;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "SELECT * FROM users WHERE account_number = ? AND password = ?");
            ps.setString(1, accountNumber);
            ps.setString(2, password);
            ResultSet rs = ps.executeQuery();
            isValid = rs.next();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return isValid;
    }
}
