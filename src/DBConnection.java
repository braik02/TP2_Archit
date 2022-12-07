import java.sql.Connection;

import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {
	   
		String BDD = "nomBD";
		String url = "jdbc:mysql://localhost:3306/" + BDD;
		String user = "root";
		String passwd = "";
	    static  Connection conn = null;

	   
	    private DBConnection()  {
	    	
	    }
	    public static Connection getDBConnection(){
	    	try { 
	    		if (conn=null) {
	    			class.forName("com.mysql.JBbdc.Driver");
	    			conn = Drivermanger.getConnection("jdbc:mysql://localhost/fees_management_system","root","tiger");
	    	}}catch(Exception e)
	    	{ e.printStackTrace();
		}

	    
	    
}


		
	
}


		
	