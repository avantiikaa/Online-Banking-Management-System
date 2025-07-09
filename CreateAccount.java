import java.sql.*;

public class CreateAccount {
    public void create(String accountNumber, String name, String password, double initialDeposit) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "INSERT INTO users (account_number, name, password, balance) VALUES (?, ?, ?, ?)");
            ps.setString(1, accountNumber);
            ps.setString(2, name);
            ps.setString(3, password);
            ps.setDouble(4, initialDeposit);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
