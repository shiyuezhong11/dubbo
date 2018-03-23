package com.commer.app;


import com.commer.app.UserService.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;


@SpringBootApplication
@ImportResource(locations = {"classpath:dubbo-consumer.xml"})
public class webStart extends SpringBootServletInitializer {

    public static void main(String[] args) {
        ApplicationContext tc = SpringApplication.run(webStart.class, args);
        UserService userService = tc.getBean(UserService.class);
        System.out.println(userService.getById(1).getUsername());
    }

}
