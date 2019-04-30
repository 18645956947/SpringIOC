import com.day0129.*;
import javafx.application.Application;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class004Text {
    @Test
    public void text(){
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);
        System.out.println("bean:"+ bean);

        //通过静态工厂方法实例化吧bean
        //Bean2 bean2 = Bean2Factory.getBean2();
        Bean2 bean2 = context.getBean("bean2", Bean2.class);
        System.out.println("bean2"+ bean2);

        //通过实例工厂方法实例化bean
//        Bean3Factory bean3Factory = new Bean3Factory();
//        bean3Factory.getBean3();
        Bean3 bean3 = context.getBean("bean3", Bean3.class);
        System.out.println("bean3:"+ bean3);
        System.out.println("---");
        //通过别名实例化
        Bean bean_1 = context.getBean("bean_1", Bean.class);
        System.out.println("bean_1:"+bean_1);
        Bean bean_2 = context.getBean("bean_2", Bean.class);
        System.out.println("bean_2:"+bean_2);
        Bean bean_3 = context.getBean("bean_3", Bean.class);
        System.out.println("bean_3:"+bean_3);

    }

}
