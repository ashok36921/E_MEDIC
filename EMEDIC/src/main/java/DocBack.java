import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DocBack")
public class DocBack extends HttpServlet {

	public void service(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException
    {
       response.setContentType("text/html");
        PrintWriter out = response.getWriter();
		
		 try{  
	    		Class.forName("com.mysql.jdbc.Driver");  
	    		Connection con=DriverManager.getConnection(  
	    		"jdbc:mysql://localhost:3306/mini_db","root","AshokJava");   //
	    		Statement stmt=con.createStatement();  
	    		ResultSet rs=stmt.executeQuery("select DocId from mini_db.doctorlogin where pass="+'"'+request.getParameter("pass")+'"');
	    		//ResultSet rs=stmt.executeQuery("SELECT aadharnum FROM mini_db.usersdetails WHERE EXISTS (SELECT aadharnum FROM mini_db.userdetails WHERE pass="+'"'+request.getParameter("pass")+'"'+')');
	    		rs.next();
	    		Statement stm=con.createStatement(); 
	    		ResultSet ss=stm.executeQuery("select * from mini_db.usersdetails where aadharnum="+'"'+request.getParameter("aad")+'"');
	    		ss.next();
	    		//	if(rs.next()) {
	    		String anum=rs.getString("DocId");
	    		//System.out.print(anum);
	    		if(!anum.equals(request.getParameter("docnum"))) {
	    			response.sendRedirect("LogJsp.jsp");
	    			return;
	    		}
	    		else {
	    			request.setAttribute("myname",request.getParameter("aad"));
	    			request.getRequestDispatcher("Option.jsp").forward(request, response);
	    		}
	    		con.close();  
	    		return;
	    		//}
//	    		//else {
//	    			out.print("<h1>"+"No data da"+"</h1>");
//	    		}//
		 }
		 
		 catch(Exception e){ 
//			 out.print("<h1>"+"AadharNumber or Password Wrong"+"</h1>");
////			 
//			System.out.print(e);
			response.sendRedirect("LogJsp.jsp");
			 return;
			 }

    }

}
