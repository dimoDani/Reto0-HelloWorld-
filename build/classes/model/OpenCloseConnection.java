package model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

public class OpenCloseConnection {
    private ResourceBundle configFile;
    private String url;
    private String user;
    private String pass;

    // CONSTRUCTOR
    public OpenCloseConnection() {
        configFile = ResourceBundle.getBundle("resources.Config");
        url = configFile.getString("URL");
        user = configFile.getString("USER");
        pass = configFile.getString("PASSWORD");
    }

    public Connection openConnection() throws SQLException  {
        Connection con = null;
        try {
        	con = DriverManager.getConnection(url, user, pass);
        } catch (SQLException e) {
			e.printStackTrace();
        }
        return con;
    }

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
