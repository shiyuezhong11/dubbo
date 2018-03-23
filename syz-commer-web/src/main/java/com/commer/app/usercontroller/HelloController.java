package com.commer.app.usercontroller;

import com.commer.app.UserService.UserService;
import com.commer.app.entity.User;
import org.apache.log4j.Logger;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

/**
 * Created by yz.shi on 2018/3/22.
 */
@Controller
public class HelloController {
    private static Logger logger = Logger.getLogger(HelloController.class);

    @Resource
    private UserService userService;

    @RequestMapping("/ss")
    private String ss() {
        return "ss";
    }

    @RequestMapping("/getUserById")
    public
    @ResponseBody
    Object getUserById() {
        User user = userService.getById(1);
        if (user != null) {
            System.out.println("user.getName():" + user.getUsername());
            logger.info("user.getAge():" + user.getUsername());
        }
        return user;
    }

}
