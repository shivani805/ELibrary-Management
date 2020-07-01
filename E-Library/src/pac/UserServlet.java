package pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.UserBean;
import DB.MyConnection;
import Dao.UserDao;

/**
 * Servlet implementation class UserServlet
 */
public class UserServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		
		System.out.println("post");
		String uname=request.getParameter("uname");
		String upass=request.getParameter("upass");
		
		String umob=request.getParameter("umob");
		
		ServletContext ctx= request.getServletContext();
		ctx.setAttribute("Ulogin", uname);
			UserBean ub=new UserBean(uname,upass,umob);	
				UserDao ud=new UserDao();
			String msg=	ud.show(ub);
			System.out.println(msg);
			if(msg.equals("find")) {
				HttpSession ss= request.getSession();
				
				
					System.out.println(ss.isNew());
				 RequestDispatcher rd= request.getRequestDispatcher("userHome.html");
                 rd.include(request, response);
				
			}else {
				pw.println("Invalid Name or Password");
			 RequestDispatcher rd= request.getRequestDispatcher("userLogin.html");
             rd.include(request, response);
		}}


	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		System.out.println("get");
		HttpSession se= req.getSession();
		se.invalidate();
		 RequestDispatcher rd= req.getRequestDispatcher("userLogin.html");
         rd.include(req, resp);
	}
			
	}


