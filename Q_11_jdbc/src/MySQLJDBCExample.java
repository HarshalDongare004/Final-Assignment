import java.sql.*;

public class MySQLJDBCExample {

    public static void main(String[] args) throws SQLException, ClassNotFoundException {

        // Register the driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Create a connection
        String url = "jdbc:mysql://localhost:3306/ineuron";
        String username = "root";
        String password = "root";
        Connection connection = DriverManager.getConnection(url, username, password);

        // Create a statement
        Statement statement = connection.createStatement();

        // Execute a query
        String sql = "SELECT * FROM student";
        ResultSet resultSet = statement.executeQuery(sql);

        // Display the results
        while (resultSet.next()) {
        	System.out.println("Id: " + resultSet.getString("id"));
            System.out.println("Name: " + resultSet.getString("name"));
            System.out.println("Age: " + resultSet.getString("age"));
            System.out.println("Address: " + resultSet.getString("address"));
        }

        // Close the connection
        connection.close();
    }
}