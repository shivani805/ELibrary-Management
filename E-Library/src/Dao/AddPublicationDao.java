package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Beans.AddPublicationBeans;
import DB.MyConnection;

public class AddPublicationDao {
	AddPublicationBeans apb;
	
	public String show(AddPublicationBeans apb) {
	this.apb=apb;
		
	try {
	Connection conn=MyConnection.getConnection();
PreparedStatement ps=conn.prepareStatement("insert into publicationDetails values(?,?,?)");
  ps.setString(1,apb.getPname());
     ps.setString(2,apb.getPmob());
     ps.setString(3,apb.getPadd());
  
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
