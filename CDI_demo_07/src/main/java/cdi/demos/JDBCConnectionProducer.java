package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.enterprise.inject.Disposes;
import javax.enterprise.inject.Produces;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCConnectionProducer {

	@Inject
	private Logger logger;

	@Produces
	@UserDatabase
	private Connection createConnection() throws Exception {

		String JDBC_DRIVER = "com.mysql.jdbc.Driver";
		String DB_URL = "jdbc:mysql://localhost:5555/world";

		String USER = "root";
		String PASS = "root";

		Class.forName(JDBC_DRIVER);

		Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);

		logger.info("Connection created");
		return conn;
	}

	private void closeConnection(@Disposes @UserDatabase Connection conn) throws SQLException {
		conn.close();
		logger.info("Connection closed");
	}
}
