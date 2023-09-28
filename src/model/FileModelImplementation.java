/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import java.util.ResourceBundle;

/**
 *
 * @author 2dam
 */
public class FileModelImplementation implements Model{

	private ResourceBundle configFile;
	private String greeting;

	@Override
	public String getGreeting() throws Exception{
		try {
			configFile = ResourceBundle.getBundle("resources.Config");
			greeting = configFile.getString("GREETING");
			return(greeting);
		} catch (Exception e) {
			throw e;
		}
	}
    
}
