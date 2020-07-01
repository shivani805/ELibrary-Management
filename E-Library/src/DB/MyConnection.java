package DB;

import java.sql.Connection;
import java.sql.DriverManager;

public class MyConnection {

	private MyConnection() {
		
		
		
	}
	public static Connection getConnection() {
		Connection connection=null;
		
		try {
		Class.forName(driver.database_driver);
		connection=(Connection) DriverManager.getConnection(driver.database_url,driver.database_name,driver.database_pass);
		
		
		}catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
		
		
		
		
		return connection;
		
		
		
	}
	
	
	
}
