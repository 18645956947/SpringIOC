import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassText07 {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        bean1.printBean2();
        bean1.printBean2();
        bean1.printBean2();
        bean1.printBean2();



    }
}
