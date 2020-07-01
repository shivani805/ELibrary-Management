package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.AddLanguageBean;
import Dao.AddLanguageDao;

/**
 * Servlet implementation class AddLanguageServ
 */
public class AddLanguageServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
  
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw=response.getWriter();
		 HttpSession hs=request.getSession();
		 System.out.println(hs.isNew());
		
		
		
		String langname=request.getParameter("langname");
		String langdesc=request.getParameter("langdesc");
		
		
		AddLanguageBean alb=new AddLanguageBean(langname,langdesc);
		AddLanguageDao ald=new AddLanguageDao();
		String msg=ald.show(alb);
		System.out.println(msg);
        if(msg.equals("inserted")){
        	  pw.append("added Successfully...........!");
        	  
        	
        }else {
        	
        	pw.append("Not added...try again");
        }
         RequestDispatcher rd= request.getRequestDispatcher("addLanguage.html");
              rd.include(request, response);
	}

}
