package cn.managesystem.controller;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/index")
public class IndexController {


    @RequestMapping("index")
    public String index ( final Model model ) {
        return "/index.jsp";
    }
}

