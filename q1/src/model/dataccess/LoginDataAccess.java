package model.dataccess;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import model.business.LoginBusiness;
import model.dataccess.connection.ConnectionFactory;

public class LoginDataAccess {
    private static LoginDataAccess instance;
	private LoginDataAccess () {}
    public static LoginDataAccess getInstance() {
        return instance = instance == null ? new LoginDataAccess() : instance;
    }

	public boolean verifyCredentials() throws ClassNotFoundException, SQLException {
        Connection connection= ConnectionFactory.getInstance().getConnection("postgres").getDatabaseConnection();
		final PreparedStatement stmt = connection.prepareStatement("SELECT * FROM users WHERE username=? and password=?");

        LoginBusiness lb = LoginBusiness.getInstance();
		stmt.setString(1, lb.getUsername());
		stmt.setString(2, lb.getPassword());

		ResultSet rs = stmt.executeQuery();

		return rs.next();
		
	}

}

