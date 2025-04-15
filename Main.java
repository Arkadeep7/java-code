import utils.DBConnection;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
        // Establish a connection to the database
        Connection connection = DBConnection.getConnection();

        // Test the connection
        if (connection != null) {
            System.out.println("Database connection is working correctly!");
        } else {
            System.out.println("Failed to connect to the database.");
        }

        // Close the connection
        DBConnection.closeConnection();
    }
}
