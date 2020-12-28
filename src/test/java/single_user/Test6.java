package single_user;

import com.spring.mvc.single_user.entities.User;
import com.spring.mvc.single_user.entities.UserView;
import com.spring.mvc.single_user.repository.UserReporsitory;
import com.spring.mvc.single_user.repository.UserViewRepository;
import java.util.Date;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;

public class Test6 {
    @Test
    public void t1() {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springMVC-servlet.xml");
        UserViewRepository uvr = ctx.getBean(UserViewRepository.class);
        //分頁
        int pageNo = 0;
        int pageSize = 10;
        //分頁請求
        PageRequest pageRequest = new PageRequest(pageNo, pageSize);
        Page<UserView> page = uvr.findAll(pageRequest);
        System.out.println(page.getContent());//得到分頁內容
        System.out.println((pageNo+1) + "/" + page.getTotalPages());
        
    }
}
