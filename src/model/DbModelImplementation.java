package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 * Model implementation using a database.
 * @author Inigo y Dani
 */
public class DbModelImplementation implements Model{
	
private Connection con;
private PreparedStatement stmt;
private OpenCloseConnection occ = new OpenCloseConnection();
	/**
     * Gets a message.
     *
     * @return The message.
     * @throws Exception If there's an error during execution.
     */
@Override	
public String getGreeting() throws Exception{
			try {
				String greeting = null;
				final String queryGetGreeting = "Select message from GreetingTable";
				con = occ.openConnection();
				stmt = con.prepareStatement(queryGetGreeting);
				ResultSet rs = stmt.executeQuery();
				
				while (rs.next()) {
				greeting = rs.getString("message");
				}
				occ.closeConnection(stmt, con);
				return (greeting); 
	
			} catch (Exception e) {
				throw e;
			}
	
		}
    
}
