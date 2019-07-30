package user.domain;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.SimpleDriverDataSource;
import user.dao.DConnectionMaker;
import user.dao.UserDao;

import javax.sql.DataSource;


@Configuration
public class DaoFactory {

//    @Bean
//    public UserDao userDao(){
//        UserDao userDao = new UserDao();
//        userDao.setConnectionMaker(connectionMaker());
////        UserDao userDao = new UserDao(connectionMaker());
//        return userDao;
//    }

    @Bean
    public DataSource dataSource(){
        SimpleDriverDataSource dataSource = new SimpleDriverDataSource();
        return dataSource;
    }

    @Bean
    public ConnectionMaker connectionMaker(){
        return new DConnectionMaker();
    }

}
