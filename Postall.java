package postgressprogram;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
public class Postall {
	private final String url="jdbc:postgresql://localhost/madhu";
	private final String user="postgres";
	private final String password="root";
	private void connect() {
		try(Connection connection = DriverManager.getConnection(url,user,password);){
			if(connection!=null) {
				System.out.println("connected to postgressql server");
			}else {
				System.out.println("failed to connect postgres server");
			}
			Statement stmt=connection.createStatement();
			ResultSet rs=stmt.executeQuery("select * from student");
			while(rs.next()) {
				System.out.println(rs.getString(1)+"\t"+rs.getString(2));
			}
		}
		catch(SQLException e) {
			e.printStackTrace();
			
		}
	}
		public static void main(String[] args) throws ClassNotFoundException {
			Postall ex=new Postall();
			ex.connect();
	}

}
