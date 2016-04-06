package marryme.net.cn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by guoshuai1 on 2016/3/30.
 */
@Controller
public class IndexController {

    @RequestMapping("/")
    public String hi(Model model) {
        return "index";
    }

}
