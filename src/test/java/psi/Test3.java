
package psi;

import com.spring.mvc.psi.entities.Inventory;
import com.spring.mvc.psi.entities.Inventory2;
import com.spring.mvc.psi.repository.Inventory2Repository;
import java.util.List;
import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;


public class Test3 {
     @Test
     public void t1(){
         ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("springdata-jpa-config.xml");
         Inventory2Repository ir2 = ctx.getBean(Inventory2Repository.class);
         
         List<Inventory2> inventories = ir2.findAll();
         System.out.println(inventories);
                
        
         ctx.close();
     }
}
