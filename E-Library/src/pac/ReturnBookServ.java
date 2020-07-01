package pac;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import DB.MyConnection;

/**
 * Servlet implementation class ReturnBook
 */
public class ReturnBookServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String returndate=request.getParameter("returndate");
		String issue=request.getParameter("issuedate");
		String stuid=request.getParameter("stuid");
		String bookname=request.getParameter("bookname");
		
		try {
			
		Connection c	=MyConnection.getConnection();
		PreparedStatement ps=c.prepareStatement("update issuebook set returndate=? where stuid=? and bookname=? and issuedate=?");
			ps.setString(1,returndate);
			ps.setString(2, stuid);
			ps.setString(3, bookname);
			ps.setString(4, issue);
		int i=	ps.executeUpdate();
		if(i>0) {
			response.getWriter().append("updated Sucessfully");
			RequestDispatcher rd=request.getRequestDispatcher("ReturnBook.jsp");
			rd.include(request, response);
		}
		else {
			response.getWriter().append("update failed");
		RequestDispatcher rd=request.getRequestDispatcher("ReturnBook.jsp");
		rd.include(request, response);}
		}catch(Exception e)
		{
			e.printStackTrace();
		}
		
	}

}
