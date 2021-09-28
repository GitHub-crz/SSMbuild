import com.crz.pojo.Books;
import com.crz.service.BookService;
import com.crz.service.BookServiceImpl;
import com.crz.service.LoginService;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    @Test
    public void test(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        LoginService loginService=(LoginService)context.getBean("LoginServiceImpl");
        System.out.println(loginService.verify("crz"));
    }
    @Test
    public void test2(){
        ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");
        BookService bookService=(BookService)context.getBean("BookServiceImpl") ;
        for (Books books : bookService.queryAllBook()) {
            System.out.println(books);
        }
    }
}
