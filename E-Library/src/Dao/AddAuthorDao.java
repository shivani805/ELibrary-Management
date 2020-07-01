package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Beans.AddAuthorBean;
import DB.MyConnection;

public class AddAuthorDao {
	AddAuthorBean b;
	public String show(AddAuthorBean b) {
		this.b=b;
		
		
		
		try {
			Connection conn=MyConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into AuthorDetails values(?,?,?)");
		  ps.setString(1,b.getAname());
		     ps.setString(2,b.getAmob());
		     ps.setString(3,b.getAadd());
		  
		     int i=ps.executeUpdate();
				 if(i>0) {
			            return "inserted";
			     }
			     
			     else {
			    	 return "not insert";
			     }
			     
			}catch (Exception e)
			{
				
				e.printStackTrace();
			}
			return "not insert";
				
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
