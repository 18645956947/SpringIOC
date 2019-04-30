package day02;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * spring 上下文环境
 */
@Configuration
@ComponentScan("day02")
public class MyConfiguration {


    @Bean
    public Map<String, Integer> integerMap(){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("aaa", 111);
        map.put("bbb", 222);
        return map;
    }


    @Bean
    public List<String> stringList(){
        List<String> list = new ArrayList<String>();
        list.add("111");
        list.add("222");
        return list;
    }
    @Bean
    @Order(54)
    public String string1(){
        return "333";
    }
    @Bean
    @Order(28)
    public String string2(){
        return "444";
    }
}
