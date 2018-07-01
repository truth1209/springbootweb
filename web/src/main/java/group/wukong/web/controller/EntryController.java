package group.wukong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by zhengli on 2018/7/1.
 */
@Controller
public class EntryController {
    @RequestMapping(value = "/entry")
    public String entry(HttpServletRequest request) throws Exception {
        return "redirect:/index/123";
    }
}
