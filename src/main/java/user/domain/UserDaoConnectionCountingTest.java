package user.domain;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import user.dao.UserDao;

import java.sql.SQLException;

public class UserDaoConnectionCountingTest {

    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CountingDaoFactory.class);

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

        CountingConnectionMaker ccm = context.getBean("connectionMaker", CountingConnectionMaker.class);
        System.out.println("Connection Counter : " + ccm.getCounter());

    }
}
