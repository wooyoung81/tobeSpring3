package user.dao;

import user.domain.ConnectionMaker;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DConnectionMaker implements ConnectionMaker {

    public Connection makeConnection() throws ClassNotFoundException, SQLException {
        Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        Connection c = DriverManager.getConnection(
                "jdbc:sqlserver://169.56.102.233:1433;databaseName=ST_TEST", "sa", "#tjqltmxkq0921"
        );
        return c;
    }
}
