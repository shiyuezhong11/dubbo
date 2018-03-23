package com.commer.app;



import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;


@SpringBootApplication
@ImportResource(locations={"classpath:dubbo-shopConsumer.xml"})
public class shopWebStart 
{	
	
    public static void main( String[] args )
    {
        ApplicationContext tc = SpringApplication.run(shopWebStart.class, args);
        UserService userService = tc.getBean(UserService.class);
        System.out.println(userService.getById(1).getUsername());
    }
}
