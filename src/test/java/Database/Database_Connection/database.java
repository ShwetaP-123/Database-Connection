package Database.Database_Connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.Test;

public class database {
	
	@Test
	public void data() throws SQLException
	{
		/*String host = "http://192.168.1.49:8000/";
		String port = "8000";*/
	//Connection con = DriverManager.getConnection("jdbc:mysql://"+ host +":"+ port +"/p2p_db", "root", "root");
		
		Connection con = DriverManager.getConnection("jdbc:mysql://http://192.168.1.49:3306/p2p_db", "root", "root");
		Statement S = con.createStatement();
	
	ResultSet R = S.executeQuery("select * from adminapp_area limit 1;");
	System.out.println(R.getString("area"));
	
	
	}

}
