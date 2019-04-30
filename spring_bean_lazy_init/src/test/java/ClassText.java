import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassText {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        System.out.println("context");
        Bean bean = context.getBean("bean", Bean.class);

    }
}
