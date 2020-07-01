package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Beans.AddLanguageBean;
import DB.MyConnection;

public class AddLanguageDao {
	AddLanguageBean alb;
	public String show(AddLanguageBean alb) {
		this.alb=alb;
		
		try {
			Connection conn=MyConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into languageDetails values(?,?)");
		  ps.setString(1,alb.getLangname());
		     ps.setString(2,alb.getLangdesc());
		     
		  
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
