package user.domain;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import user.dao.UserDao;

import java.sql.SQLException;

public class UserDaoTest {

    public static void main(String[] args) throws SQLException {


        ApplicationContext context = new GenericXmlApplicationContext("applicationContext.xml");

        UserDao dao = context.getBean("userDao", UserDao.class);

        User user = new User();

        user.setId("adminesces");
        user.setName("kim woo young");
        user.setPassword("svctop");

        dao.add(user);

        System.out.println(user.getId() + " 등록 성공");

        User user2 = dao.get(user.getId());
        System.out.println(user2.getName() + " getName");
        System.out.println(user2.getPassword() + " getPassword");
        System.out.println("조회성공");
    }
}
