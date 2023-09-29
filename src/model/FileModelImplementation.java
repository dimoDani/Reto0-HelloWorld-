package model;

import java.util.ResourceBundle;

/**
 * Model implementation using files.
 * @author Dani and Iñigo
 */
public class FileModelImplementation implements Model{

	private ResourceBundle configFile;
	private String greeting;
    /**
     * Gets a greeting message from the file.
     *
     * @return The greeting message.
     * @throws Exception If there's an error during execution.
     */
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
