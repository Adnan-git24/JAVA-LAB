package jdbc;
import java.sql.*;
public class preEmp {

	public static void main(String[] args) {
		 String driver_name="com.mysql.cj.jdbc.Driver";
	        String host="jdbc:mysql://localhost:3306/Employeedb";
	        String username="root";
	        String pwd="Adnanmysql@24";
	        String query="select* from employee where salary>=?";
	        long inSalary=20000;
	        try {
				Class.forName(driver_name);
			 	Connection con=DriverManager.getConnection(host,username,pwd);
			 	PreparedStatement pst=con.prepareStatement(query);
			 	
			 	
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	        
	        
	}
	
	
}
