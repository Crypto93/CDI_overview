package cdi.demos;

import org.apache.logging.log4j.Logger;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import java.sql.Connection;
import java.sql.SQLException;

@ApplicationScoped
public class JDBCPingService {

    @Inject
    private Logger logger;

    @Inject
    @UserDatabase
    private Connection conn;

    public void ping() throws SQLException {
        conn.createStatement().executeQuery("SELECT 1 FROM SYSIBM.SYSDUMMY1");
        logger.info("Ping....");
    }
}
