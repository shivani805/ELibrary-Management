package pac;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;


public class AdminServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public AdminServlet() {
        super();
        
    }



	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		PrintWriter pw=response.getWriter();
		
		String name=request.getParameter("Aname");
		
		String pass=request.getParameter("Apass");
		
		
		

		 if(name.equals("shivani123")&&pass.equals("12345")) {
				HttpSession hs= request.getSession();
			System.out.println(hs.isNew());
				hs.setAttribute("name1",name);
				hs.setAttribute("pass1",pass);	 
	
		 RequestDispatcher rd= request.getRequestDispatcher("index.html");
		 rd.forward(request, response);
		 
		 
		 }
		 
		 else {
			 pw.println("Invalid Name or Password");
			 RequestDispatcher rd= request.getRequestDispatcher("admin1.html");
			 rd.include(request, response);
			
		 }
	}



	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
	
		HttpSession session= req.getSession();
		session.invalidate();
		System.out.println("get");
		 RequestDispatcher rd= req.getRequestDispatcher("admin1.html");
		 rd.forward(req, resp);
	}
	

}
