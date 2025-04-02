import java.sql.*;

public class Main1 {
  
    private static final String DB_URL = "jdbc:mysql://localhost:3306/javalab";
    private static final String USER = "root";
    private static final String PASS = "2004";
   
    public static void main(String[] args) {
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;

        try {
            // Load MySQL JDBC Driver
            Class.forName("com.mysql.cj.jdbc.Driver");
            
            // Establish connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);
            System.out.println("Connected to database successfully!");

            // Create statement and execute query
            st = conn.createStatement();
            rs = st.executeQuery("SELECT * FROM EMP");

            // Display results
            System.out.println("Employee Records:");
            System.out.println("----------------------------------");
            while (rs.next()) {
                String id = rs.getString("E_Id");
                String name = rs.getString("E_Name");
                String dept = rs.getString("Dept");
                
                System.out.println("ID: " + id + ", Name: " + name + ", Dept: " + dept);
            }
            System.out.println("----------------------------------");

        } catch (Exception e) {
            e.printStackTrace();
        } 
        }
    }

