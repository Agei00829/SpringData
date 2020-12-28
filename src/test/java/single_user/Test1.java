package single_user;

import com.spring.mvc.single_user.entities.User;
import com.spring.mvc.single_user.repository.UserReporsitory;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test1 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springMVC-servlet.xml");
        UserReporsitory ur = ctx.getBean(UserReporsitory.class);
        
        User user = new User();
        user.setName("Joe");
        user.setEmail("AAA@gmail.com");
        user.setBirth(new Date());
        //saveAndFlush(); 及時儲存
        ur.save(user);//方法結束後才儲存
    }
}
