package Dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import Beans.AddBookBean;
import DB.MyConnection;

public class AddBookDao {

	
	
	AddBookBean ab;
	 public String show(AddBookBean ab) {
		 
		 this.ab=ab;
			try {
				Connection conn=MyConnection.getConnection();
			PreparedStatement ps=conn.prepareStatement("insert into bookDetails values(?,?,?,?,?,?,?,?,?,?)");
			    ps.setString(1,ab.getLibraryname());
			     ps.setString(2,ab.getBookname());
			     ps.setString(3,ab.getPublication());
			     ps.setString(4, ab.getSubject());
			     ps.setString(5, ab.getEditionYear());
			     ps.setString(6, ab.getPrice());
			     ps.setString(7, ab.getNoOfCopies());
			     ps.setString(8, ab.getLanguage());
			     ps.setString(9, ab.getAuthor());
			     ps.setString(10, ab.getPurchaseDate());
			     
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
