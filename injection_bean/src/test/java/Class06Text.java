import com.class06.Bean;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Class06Text {

    @Test
    public void text(){
        //通过构造方法实例化bean   通过get set实例化
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Bean bean = context.getBean("bean", Bean.class);

        System.out.println("bean.getStringList() = " + bean.getStringList());
        System.out.println("bean.getStringSet() = " + bean.getStringSet());
        System.out.println("bean.getStringMap() = " + bean.getStringMap());
        System.out.println("bean.getAnotherBeanList() = " + bean.getAnotherBeanList());
        System.out.println("bean.getAnotherBeanSet() = " + bean.getAnotherBeanSet());
        System.out.println("bean.getAnotherBeanMap() = " + bean.getAnotherBeanMap());
        System.out.println("bean.getProperties() = " + bean.getProperties());
        System.out.println("bean.getAnotherBean2() = " + bean.getAnotherBean2());



    }

}
