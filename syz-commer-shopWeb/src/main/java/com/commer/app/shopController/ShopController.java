package com.commer.app.shopController;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class ShopController {

    @RequestMapping("home")
    public String home() {
        return "shop";
    }

}
