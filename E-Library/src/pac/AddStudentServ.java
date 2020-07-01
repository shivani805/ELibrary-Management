package pac;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import Beans.AddStudentBeans;
import Dao.AddStudentDao;

/**
 * Servlet implementation class AddStudentServ
 */
public class AddStudentServ extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter pw= response.getWriter();
		 HttpSession hs=request.getSession();
		 System.out.println(hs.isNew());
                  String name1=(String) hs.getAttribute("name1");
                  String pass1=(String) hs.getAttribute("pass1");
            //      pw.append(name1 +" "+pass1);
//                  ServletContext ctx= getServletContext();
//          		Connection conn1=(Connection) ctx.getAttribute("myconn");
          	//	pw.println(conn1);
                  
                  
        
        		String stuname=request.getParameter("sname");
        	    String studob=request.getParameter("sdob");
           		String stunation=request.getParameter("snation");
        		String stumob=request.getParameter("smob");
        		String stuadd=request.getParameter("sadd");
        	    String stuemail=request.getParameter("semail");
        		String stugender=request.getParameter("gender");
        		String stulogin=request.getParameter("slogin");
        	    String stupass=request.getParameter("spass");
        		String stuconpass=request.getParameter("sconpass");
        			
 //	pw.println(stuname+""+studob+""+stunation+""+stumob+""+stuadd+""+stuemail+" "+stugender+""+stulogin+""+stupass+" "+stuconpass);
        		
        		if(stupass.equals(stuconpass)) {
        		AddStudentBeans asb=new AddStudentBeans(stuname,studob,stunation,stumob,stuadd,stuemail,stugender,stulogin,stupass);
        		AddStudentDao asd=new AddStudentDao();
        		String msg=asd.show(asb);
        		System.out.println(msg);
	                if(msg.equals("inserted")){
	                	  pw.append("added Successfully...........!");
	                		RequestDispatcher  rd= request.getRequestDispatcher("addStudent.html");
	        		         rd.include(request, response);
	                }else {
	                	
	                	pw.append("Not added...try again");
	                	RequestDispatcher  rd= request.getRequestDispatcher("addStudent.html");
       		         rd.include(request, response);
	                }
			
	
        		}else
        			pw.append("Something Wrong .....Try Again");{
        			RequestDispatcher  rd= request.getRequestDispatcher("addStudent.html");
        		         rd.include(request, response);
	}}

}
