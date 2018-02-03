
package javaapplication1;

/**
 *
 * @author orean
 */



import java.sql.*; 
import org.json.*;
import java.security.SecureRandom;
import java.sql.*;
import java.io.FileWriter;
import java.io.IOExceptionption;
import java.servlet.*;
import javax.servlet.http*;


public class JavaApplication1 {
   
    public staic void jasonMake(){
    
    
    
    }
    
    protected static SecureRandom random = new SecureRandom();
        
        public static synchronized String generateToken( String username ) {
                long longToken = Math.abs( random.nextLong() );
                String random = Long.toString( longToken, 16 );
                return ( username + ":" + random );
        }

    
    public static void main(String[] args) {
        
        
    try{
    Class.forName("com.mysql.jdbc.Driver");
   Connection con=DriverManager.getConnection(
   "jdbc:mysql://192.168.43.40/sanjeevani","root","root");
    //establishing connection to the database
    Statement stmt=con.createStatement();
    }catch(Exception e){System.out.println(e);}
    
    String name = "Rahul";
    System.out.println(generateToken(name));
    }
    
}



  
  
public void doGet(HttpServletRequest request, HttpServletResponse response){  
        try{  
  
        response.setContentType("text/html");  
        PrintWriter out = response.getWriter();  
          
        String n=request.getParameter("userName");  
        out.print("Welcome "+n);  
          
        HttpSession session=request.getSession();  
        session.setAttribute("uname",n);  
  
        out.print("<a href='servlet2'>visit</a>");  
                  
        out.close();  
  
                }catch(Exception e){System.out.println(e);}  
    }  
  
