import java.io.BufferedReader;
import java.sql.*;
import java.util.Scanner;

public class CRUDApplication {

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

        // Create a scanner to read user input
        Scanner scanner = new Scanner(System.in);

        // Display the menu
        System.out.println("Welcome to the CRUD application!");
        System.out.println("What would you like to do?");
        System.out.println("1. Add a record");
        System.out.println("2. View all records");
        System.out.println("3. Update a record");
        System.out.println("4. Delete a record");

        // Get the user's choice
     Scanner br = new Scanner(System.in); 
        int choice = br.nextInt();

        // Switch on the user's choice
        switch (choice) {
            case 1:
                // Add a record
                System.out.println("Enter the name of the new record:");
                String name = scanner.nextLine();
                System.out.println("Enter the age of the new record:");
                Integer age = scanner.nextInt();
                System.out.println("Enter the address of the new record:");
                String address = scanner.nextLine();

                // Create an insert statement
                String sql = "INSERT INTO student ( name,age,address ) VALUES ( ?,?, ?)";
                PreparedStatement preparedStatement = connection.prepareStatement(sql);

                // Set the parameters
                preparedStatement.setString(1, name);
                preparedStatement.setInt(2,age );
                preparedStatement.setString(3, address);

                // Execute the statement
                preparedStatement.executeUpdate();

                // Display a success message
                System.out.println("Record added successfully!");
                break;
            case 2:
                // View all records
                String sql2 = "SELECT * FROM student";
                ResultSet resultSet = statement.executeQuery(sql2);

                // Display the results
                while (resultSet.next()) {
                	   System.out.println("ID: " + resultSet.getString("id"));
                    System.out.println("Name: " + resultSet.getString("name"));
                    System.out.println("Age: " + resultSet.getString("age"));
                    System.out.println("Address: " + resultSet.getString("address"));
                }
                break;
            case 3:
                // Update a record
                System.out.println("Enter the ID of the record you want to update:");
                Integer id = scanner.nextInt();
                System.out.println("Enter the new name of the record:");
                String newName = scanner.nextLine();
                System.out.println("Enter the new email of the record:");
                Integer newAge = scanner.nextInt();
                System.out.println("Enter the new Address of the record:");
                String newAddress = scanner.nextLine();

                // Create an update statement
                String sql3 = "UPDATE student SET name = ?, age = ?,address=? WHERE id = ?";
                PreparedStatement preparedStatement2 = connection.prepareStatement(sql3);

                // Set the parameters
                preparedStatement2.setString(1, newName);
                preparedStatement2.setInt(2, newAge);
                preparedStatement2.setString(3, newAddress);

                // Execute the statement
                preparedStatement2.executeUpdate();

                // Display a success message
                System.out.println("Record updated successfully!");
                break;
            case 4:
                // Delete a record
                System.out.println("Enter the ID of the record you want to delete:");
                Integer deleteId = scanner.nextInt();

                // Create a delete statement
                String sql4 = "DELETE FROM student WHERE id = ?";
                PreparedStatement preparedStatement3 = connection.prepareStatement(sql4);

                // Set the parameters
                preparedStatement3.setInt(1, deleteId);

                // Execute the statement
                preparedStatement3.executeUpdate();

                // Display a success message
                System.out.println("Record deleted successfully!");
                break;
            default:
                System.out.println("Invalid choice!");
                break;
        }
    }
}
