package layui.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class indexController {

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/demo")
    public String demo(){
        return "/demo";
    }
}
