package user.domain;

import javax.sql.CommonDataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Wrapper;

public interface DataSource extends CommonDataSource, Wrapper {
    Connection getConnection() throws SQLException;
}
