package svj4.sanjay.javaFiles;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class databaseConnection {
	
	public static ResultSet databaseConnectionMethod(String tableName) throws SQLException
	{
		try {
			
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			
		} 
		catch (ClassNotFoundException e) {		
		}
		//Connecting to database
		String databaseUrl="jdbc:sqlserver://LAPTOP-6IA90KVK;databaseName=youtubeApi;"
				+ "integratedSecurity=true;encrypt=true;trustServerCertificate=true";
		Connection myconn=DriverManager.getConnection(databaseUrl);
		Statement statement=myconn.createStatement();
		String myquery="SELECT * FROM "+ tableName +"";
		ResultSet results=statement.executeQuery(myquery);
		
		if(results!=null) {
		return results;
		}
		else {
			return null;
		}
	}
	
}