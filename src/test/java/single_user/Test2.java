package single_user;

import com.github.javafaker.Faker;
import com.spring.mvc.single_user.entities.User;
import com.spring.mvc.single_user.repository.UserReporsitory;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springMVC-servlet.xml");
        UserReporsitory ur = ctx.getBean(UserReporsitory.class);
        Faker faker = new Faker();
        for(int i=0;i<168;i++){
        User user = new User();
        user.setName(faker.name().lastName());
        user.setEmail(faker.internet().emailAddress());
        user.setBirth(faker.date().birthday());
        //saveAndFlush(); 及時儲存
        ur.save(user);//方法結束後才儲存
        }
     }
}
