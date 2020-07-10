package io.pragra.learning.aopdemo;

import io.pragra.learning.aopdemo.domain.GuestList;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class AopDemoApplication {

    public static void main(String[] args) {
       ApplicationContext  context = SpringApplication.run(AopDemoApplication.class, args);

        System.out.println(context.getBean(GuestList.class).getNames());
    }

}
