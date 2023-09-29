package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;
/**
 * This class has methods to open and close database connections.
 * @author Dani and Iñigo
 */
public class OpenCloseConnection {
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    /**
	 * Constructor that loads the configuration file.
	 */
    public OpenCloseConnection() {
        configFile = ResourceBundle.getBundle("resources.Config");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");
    }
	/**
     * Opens a database connection.
     *
     * @return A new Connection object.
     * @throws SQLException If there's an error during connection.
     */
    public Connection openConnection() throws SQLException  {
        Connection con = null;
        try {
        	con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
			e.printStackTrace();
        }
        return con;
    }
    /**
     * Closes the obteined PreparedStatement and Connection.
     *
     * @param stmt The PreparedStatement to close.
     * @param con  The Connection to close.
     * @throws SQLException If there's an error during closure.
     */
    public void closeConnection(PreparedStatement stmt, Connection con) throws SQLException {
        if (stmt != null) {
            try {
                stmt.close();
            } catch (SQLException e) {
				e.printStackTrace();
            }
        }
        if (con != null) {
            try {
                con.close();
            } catch (SQLException e) {
				e.printStackTrace();
            }
        }
    }
}
