import com.Bean1;
import com.MyConfiguration;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Text {

    @Test
    public void text(){
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfiguration.class);
        Bean1 bean1 = context.getBean("bean3", Bean1.class);
        System.out.println("bean = " + bean1);
    }
}
