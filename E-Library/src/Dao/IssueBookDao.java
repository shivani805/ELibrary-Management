package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Beans.IssueBookBean;
import DB.MyConnection;
import DB.driver;

public class IssueBookDao {
	IssueBookBean sbb;
	Connection conn=null;
	
	
	
	
	
public	String show(IssueBookBean sbb) {
		this.sbb=sbb;
		
		try {
			 conn=MyConnection.getConnection();
		PreparedStatement ps=conn.prepareStatement("insert into issueBook values(?,?,?,?)");
			ps.setString(1, sbb.getStuid());
			ps.setString(2, sbb.getBookname());
			ps.setString(3, sbb.getIssuedate());
			ps.setString(4,sbb.getReturndate());
			int i=ps.executeUpdate();
			if(i>0)
			{
				return "inserted";
			}
			else 
				return "not inserted";
			
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
		return "not inseted";
	}
}
