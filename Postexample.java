package postgressprogram;
import java.sql.*;
public class Postexample {
private final String url="jdbc:postgresql://localhost/madhu";
private final String user="postgres";
private final String password="root";
private void connect() {
	try(Connection connection = DriverManager.getConnection(url,user,password);){
		if(connection !=null) {
			System.out.println("connected to postgressql server");
		}else {
			System.out.println("failed to connect postgres server");
		}
	}
	catch(SQLException e)
	{
		e.printStackTrace();
}
}
	public static void main(String[] args) {
Postexample ex=new Postexample();
ex.connect();
		
		}

}
