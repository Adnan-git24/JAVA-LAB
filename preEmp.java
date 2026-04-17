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
	        String insertQuery="""
	        		(name,)
	        		""";
	        try {
				Class.forName(driver_name);
			 	Connection con=DriverManager.getConnection(host,username,pwd);
			 	PreparedStatement inpst=con.prepareStatement(insertQuery);
			 	inpst.setString(1, "Emp");
			 	inpst.setString(2, "MCA");
			 	inpst.setLong(3, 65000);
			 	inpst.executeUpdate();
			 	
			 	
			 	PreparedStatement pst=con.prepareStatement(query);
			 	pst.setLong(1, inSalary);
			 	ResultSet rs=pst.executeQuery();
			 	System.out.println("ID\t|Name\t|Dept\t\t|Salary");
			 	while(rs.next()) {
			 	int id=rs.getInt("id");
        		String name=rs.getString("name");
        		String dept=rs.getString("dept");
        		long Salary=rs.getLong("salary");
        		System.out.println(String.format("%d\t|%s\t|%s       |%d", id,name,dept,Salary));
        	}
				rs.close();con.close();
			 	
			} catch (ClassNotFoundException | SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}	        
	        
	}
	
	
}
