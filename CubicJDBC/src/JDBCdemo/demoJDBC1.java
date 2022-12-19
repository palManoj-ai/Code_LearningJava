package JDBCdemo;
import java.sql.Connection;              //1. OR import.java.sql.* imports all libraries of mySQL
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class demoJDBC1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost:3306/batch13";  //rem that last word is schema name
		String username="root";
		String password="root";
		
		try {                                                 //use try catch or use throws at class declaration
			Class.forName("com.mysql.jdbc.Driver");           //Step2 Loading driver
			System.out.println("Driver loaded");   
			
			//3. Setting up connection, url format is: "jdbc:mysql://localhost:portno/tablename
			//to find portno https://stackoverflow.com/questions/4093603/how-do-i-find-out-my-mysql-url-host-port-and-username
	
			Connection conn=DriverManager.getConnection(url,username,password);
			System.out.println("connection is created");
			
			//3. Create statement
			
			PreparedStatement ps=conn.prepareStatement("select * from nov22_employee");  //statement vs preparedstatement
			//select * from tablename, * = all
			//select phoneno from nov22_employee, only fetches phoneno

			
			ResultSet rs=ps.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString("salary")+" "+rs.getInt(4));
				//System.out.println(rs.getInt("phoneno")); if only phoneno reqd
			}
			
			ps.close();  //Closing statement
			conn.close();
		}catch (ClassNotFoundException |SQLException ex) {
				ex.printStackTrace();
		} 

	}

}
