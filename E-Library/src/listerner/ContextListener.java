package listerner;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * Application Lifecycle Listener implementation class ContextListener
 *
 */
public class ContextListener implements ServletContextListener {

    public ContextListener() {
//        // TODO Auto-generated constructor stub
//    }
//
//	
//    public void contextDestroyed(ServletContextEvent sce)  { 
//         System.out.println("destory context"+sce);
//    }
//
//	
//    public void contextInitialized(ServletContextEvent sce)  { 
//        
//    	Connection conn;
//    	
//    	try {
//    		Class.forName("com.mysql.cj.jdbc.Driver");
//    		conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/elibrarydatabase","root","root");
//    		//System.out.println(conn);
//    		PreparedStatement ps= (PreparedStatement) conn.prepareStatement("Create table studentdetailss(stuname varchar(15),studob varchar(10),stunation varchar(10),stumob int,stuadd varchar(20),stuemail varchar(15),stugender varchar(5),stulogin varchar(15),stupass varchar(10))");
//    		ps.executeUpdate();
//    		ServletContext ctx= sce.getServletContext();
//    				ctx.setAttribute("myconn", conn);;
//    	}catch(Exception e) {
//    		e.printStackTrace();
 //  	}
    }
	
}
