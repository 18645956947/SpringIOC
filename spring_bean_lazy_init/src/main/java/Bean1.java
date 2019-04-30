import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class Bean1 implements InitializingBean, DisposableBean {
    public void onInit(){
        System.out.println("Bean1.init");
    }
    public void onDestory(){
        System.out.println("Bean.destory");
    }

    public void destroy() throws Exception {
        System.out.println("    bean1.destory()");
    }

    public void afterPropertiesSet() throws Exception {
        System.out.println("bean1.afterPorperties");
    }
}
