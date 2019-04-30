package day02;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Component;

import javax.print.DocFlavor;
import java.util.List;
import java.util.Map;

@Component
public class MyBean {


    private AnotherBean anotherBean1;
    private AnotherBean anotherBean2;

    @Autowired
    private AnotherBean anotherBean3;


    private List<String> stringList;

    public List<String> getStringList() {
        return stringList;
    }

    private Map<String, Integer> integerMap;

    private String string;

    private ApplicationContext context;


    public ApplicationContext getContext() {
        return context;
    }
    @Autowired
    public void setContext(ApplicationContext context) {
        this.context = context;
    }

    public String getString() {
        return string;
    }

    @Value("999")
    public void setString(String string) {
        this.string = string;
    }

    public Map<String, Integer> getIntegerMap() {
        return integerMap;
    }

    @Autowired
    public void setIntegerMap(Map<String, Integer> integerMap) {
        this.integerMap = integerMap;
    }

    @Autowired
    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    @Autowired
    public void setAnotherBean2(AnotherBean anotherBean2) {
        this.anotherBean2 = anotherBean2;
    }

    @Override
    public String toString() {
        return "MyBean{" +
                "anotherBean1=" + anotherBean1 +
                ", anotherBean2=" + anotherBean2 +
                ", anotherBean3=" + anotherBean3 +
                ", string=" + string +
                '}';
    }

    @Autowired
    public MyBean(AnotherBean anotherBean1) {

        this.anotherBean1 = anotherBean1;
    }


}
