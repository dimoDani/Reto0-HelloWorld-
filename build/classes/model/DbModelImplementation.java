/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
/**
 *
 * @author Inigo y Dani
 */
public class DbModelImplementation implements Model{
	
private Connection con;
private PreparedStatement stmt;
private OpenCloseConnection occ = new OpenCloseConnection();

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
