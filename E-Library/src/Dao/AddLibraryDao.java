package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Beans.AddLibraryBean;
import DB.MyConnection;

public class AddLibraryDao {
	AddLibraryBean alb;
	public String show(AddLibraryBean alb) {
		this.alb=alb;
		try {
			Connection conn=MyConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into libraryDetails values(?,?,?)");
		  ps.setString(1,alb.getLname());
		     ps.setString(2,alb.getLmob());
		     ps.setString(3,alb.getLadd());
		  
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
