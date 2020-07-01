package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;

import Beans.UserBean;
import DB.MyConnection;

public class UserDao {
	UserBean ub;
	
	public String show(UserBean ub) {
		this.ub=ub;
		
		try {
		Connection conn =MyConnection.getConnection();
			
			PreparedStatement ps=conn.prepareStatement("select * from studentdetails where stulogin=? and stupass=? and stumob=?");
			ps.setString(1, ub.getUname());
			ps.setString(2, ub.getUpass());
			ps.setString(3, ub.getUmob());
			
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				
				
				return "find";
			}
			else
				return "not find";
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	
	return "not find";
	
}
	
	
	
	
	
	
	
	
}
