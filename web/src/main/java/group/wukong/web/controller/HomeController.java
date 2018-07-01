package group.wukong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zheng.li on 2017/9/11.
 */
@Controller
public class HomeController {

    @RequestMapping(value = "/home")
    public String entry(HttpServletRequest request) throws Exception {
        return "home";
    }
}