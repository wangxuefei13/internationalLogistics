import com.crm.controller.UserController;
import com.crm.entity.User;
import com.crm.service.UserService;
import com.crm.util.R;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.List;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations={"classpath*:applicationContext.xml"})
public class text {

    @Autowired
    UserService userService;

    @Test
    public  void test() {
        System.out.println(R.ok());

    }
}
