package JDBC;
import java.sql.*;
public class Main {
    public static void main(String[] args) {
        try {
            // 1. Load and register the Driver
            String driverName = "com.mysql.cj.jdbc.Driver";
            Class.forName(driverName);
            // 2. Establish Connection with the database
            String url = "jdbc:mysql://localhost:3306/hospital_management";
            String user = "root";
            String password = "root";
            Connection con = DriverManager.getConnection(url,user,password);
            // 3. Create the Statement Object
            Statement st = con.createStatement();
            // 4. Prepare, send and execute the query
            String Query = "select * from admin";
            ResultSet rs = st.executeQuery(Query);
            // 5. Process thr result from resultset
            while (rs.next()){
                int id = rs.getInt(1);
                String city = rs.getString(2);
                String email_id = rs.getString(3);
                String first_name = rs.getString(4);
                String last_name = rs.getString(5);
                int pincode = rs.getInt(8);
                String user_name = rs.getString(10);
                System.out.println(id+" "+city+" "+email_id+" "+first_name+" "+last_name+" "+pincode+" "+user_name);
            }
            // 6. Close the connection
            con.close();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
