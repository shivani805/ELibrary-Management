package pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.AddPublicationBeans;
import Dao.AddPublicationDao;

/**
 * Servlet implementation class addPublicationServ
 */
public class addPublicationServ extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public addPublicationServ() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		 HttpSession hs=request.getSession();
		 System.out.println(hs.isNew());
//                 String name1=(String) hs.getAttribute("name1");
//                 String pass1=(String) hs.getAttribute("pass1");
//      pw.append(name1 +" "+pass1);
//                 ServletContext ctx= getServletContext();
//         		Connection conn1=(Connection) ctx.getAttribute("myconn");
//	pw.println(conn1);
                 
                 
       
       		String pname=request.getParameter("pname");
       	    String pmob=request.getParameter("pmob");
          	String padd=request.getParameter("padd");
       		
       			AddPublicationBeans apb=new AddPublicationBeans(pname,pmob,padd);
       			AddPublicationDao apd=new AddPublicationDao();
                     String msg=apd.show(apb);
                     System.out.println(msg);
 	                if(msg.equals("inserted")){
 	                	  pw.append("added Successfully...........!");
 	                	  
 	                	
 	                }else {
 	                	
 	                	pw.append("Not added...try again");
 	                }
 			         RequestDispatcher rd= request.getRequestDispatcher("addPublication.html");
	                       rd.include(request, response);
       		
       		
       		
	        
	}

}

