package Dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import Beans.AddStudentBeans;
import DB.MyConnection;

public class AddStudentDao {

	AddStudentBeans asb;
	
	public String show(AddStudentBeans asb) {
		
		this.asb=asb;
		
		try {
		Connection conn=MyConnection.getConnection();
	PreparedStatement ps=conn.prepareStatement("insert into studentDetails values(?,?,?,?,?,?,?,?,?,?)");
	ps.setString(1, null);
	  ps.setString(2,asb.getStuname());
	     ps.setString(3,asb.getStudob());
	     ps.setString(4,asb.getStunation());
	     ps.setString(5, asb.getStumob());
	     ps.setString(6, asb.getStuadd());
	     ps.setString(7, asb.getStuemail());
	     ps.setString(8, asb.getStugender());
	     ps.setString(9,asb.getStulogin());
	     ps.setString(10, asb.getStupass());
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
