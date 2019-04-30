package com;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com")
public class MyConfiguration {

    @Bean({"bean3", "bean22"})
    public Bean1 bean(){
        return new Bean1();
    }
}
