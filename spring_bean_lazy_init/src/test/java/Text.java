import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Text {
    @Test
    public void text(){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean1 bean1 = context.getBean("bean1", Bean1.class);
        System.out.println("bean1:"+bean1);

        context.close();
    }

}
