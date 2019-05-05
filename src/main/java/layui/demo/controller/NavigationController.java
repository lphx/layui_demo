package layui.demo.controller;

import layui.demo.service.NavigationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Map;

@Controller
@RequestMapping("/navigation")
public class NavigationController {

    @Autowired
    NavigationService navigationService;

    @GetMapping("/findMenu")
    @ResponseBody
    public Map<String,Object> findMenu(){
        Map<String, Object> data = navigationService.findMenu();
        return data;
    }

}
