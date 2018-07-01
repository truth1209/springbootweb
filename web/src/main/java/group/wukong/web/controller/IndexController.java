package group.wukong.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zhengli on 2018/7/1.
 */
@Controller
public class IndexController {
    @RequestMapping(value = "/index/{id}")
    public String entry(Model model,
                        @PathVariable("id") String id
                        ) throws Exception {
        model.addAttribute("id",id);
        return "index";
    }
}
