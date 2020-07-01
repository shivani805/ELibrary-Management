package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.AddLibraryBean;
import Dao.AddLibraryDao;

/**
 * Servlet implementation class AddLibraryServ
 */
public class AddLibraryServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		 HttpSession hs=request.getSession();
		 System.out.println(hs.isNew());
		
		
		
		String lname=request.getParameter("lname");
		String lmob=request.getParameter("lmob");
		String ladd=request.getParameter("ladd");
		
		AddLibraryBean alb=new AddLibraryBean(lname,lmob,ladd);
		
		AddLibraryDao ald=new AddLibraryDao();
		String msg=ald.show(alb);
	       System.out.println(msg);
            if(msg.equals("inserted")){
            	  pw.append("added Successfully...........!");
            	  
            	
            }else {
            	
            	pw.append("Not added...try again");
            }
	         RequestDispatcher rd= request.getRequestDispatcher("addLibrary.html");
                  rd.include(request, response);
		
		
	}

}
