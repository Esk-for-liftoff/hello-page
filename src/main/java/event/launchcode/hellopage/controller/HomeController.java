package event.launchcode.hellopage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
    @RequestMapping("")
    public String index(Model model) {
        model.addAttribute("title","index" );
        return "index";
    }

    @GetMapping("templates/women")
    public String displayAddJobForm(Model model) {
        model.addAttribute("templates/women", "templates/women");
        return "customer/women";
    }

}
