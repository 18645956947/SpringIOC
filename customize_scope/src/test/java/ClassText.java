import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClassText {

    @Test
    public void text(){
        final ApplicationContext   context = new ClassPathXmlApplicationContext("spring.xml");
        for (int i = 0; i < 10; i++) {
            Bean bean = context.getBean("bean", Bean.class);
            System.out.println("bean = "+ bean);
        }
        System.out.println("==============");
        for (int i = 0; i < 10; i++) {
            new Thread(new Runnable() {
                public void run() {
                    Bean bean = context.getBean("bean", Bean.class);
                    System.out.println("bean = "+ bean);
                }
            }).start();
        }

    }




}
