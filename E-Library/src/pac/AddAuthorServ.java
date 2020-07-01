package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.AddAuthorBean;
import Beans.AddLanguageBean;
import Dao.AddAuthorDao;
import Dao.AddLanguageDao;

/**
 * Servlet implementation class AddAuthorServ
 */
public class AddAuthorServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		 HttpSession hs=request.getSession();
		 System.out.println(hs.isNew());
		
		
		
		String aname=request.getParameter("aname");
		String amob=request.getParameter("amob");
		String aadd=request.getParameter("aadd");
		
		AddAuthorBean b=new AddAuthorBean(aname,amob,aadd);
		AddAuthorDao d=new AddAuthorDao();
		String msg=d.show(b);
	//	System.out.println(msg);
        if(msg.equals("inserted")){
        	  pw.append("added Successfully...........!");
        	  
        	
        }else {
        	
        	pw.append("Not added...try again");
        }
         RequestDispatcher rd= request.getRequestDispatcher("addAuthor.html");
              rd.include(request, response);
	}

	
	
	
	
	
	}


