package event.launchcode.hellopage.controller;

import event.launchcode.hellopage.model.MenItems;
import event.launchcode.hellopage.model.WomenItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WomenController {
    @GetMapping("cosmetics")
    public String cosmeticsModel(Model model) {
        model.addAttribute(new WomenItems());
        return "women/cosmetics";
    }
    @GetMapping("blouse")
    public String blouseModel(Model model) {
        model.addAttribute(new WomenItems());
        return "women/blouse";
    }
    @GetMapping("underwear")
    public String underwearModel(Model model) {
        model.addAttribute(new WomenItems());
        return "women/underwear";
    }
    @GetMapping("purse")
    public String purseModel(Model model) {
        model.addAttribute(new WomenItems());
        return "women/purse";
    }
}
