package JDBCdemo;

import java.sql.DriverManager;

public class JDBCdemoInsert {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String url="jdbc:mysql://localhost/3306/batch13";
		String user="root";
		String pw="root";
		
		try {
		//1 load driver
		Class.forName("com.mysql.jdbc.Driver");
		System.out.println("Driver load complete!");
		
		//2 create connection
		Connection conn2=DriverManager.getConnection(url,user,pw);
		System.out.println("Connection created");
		
		//3 statement
		Statement st=conn.createStatement("INSERT * FROM nov22_employee")
		
		}

}
}
