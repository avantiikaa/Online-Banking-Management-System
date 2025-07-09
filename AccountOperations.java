import java.sql.*;

public class AccountOperations {

    public void deposit(String accountNumber, double amount) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE users SET balance = balance + ? WHERE account_number = ?");
            ps.setDouble(1, amount);
            ps.setString(2, accountNumber);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void withdraw(String accountNumber, double amount) {
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "UPDATE users SET balance = balance - ? WHERE account_number = ?");
            ps.setDouble(1, amount);
            ps.setString(2, accountNumber);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public double checkBalance(String accountNumber) {
        double balance = 0.0;
        try {
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(
                "SELECT balance FROM users WHERE account_number = ?");
            ps.setString(1, accountNumber);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                balance = rs.getDouble("balance");
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return balance;
    }
}
