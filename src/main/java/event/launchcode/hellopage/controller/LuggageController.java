package event.launchcode.hellopage.controller;

import event.launchcode.hellopage.model.Luggages;
import event.launchcode.hellopage.model.MenItems;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LuggageController {
    @GetMapping("caryons")
    public String caryonsModel(Model model) {
        model.addAttribute(new Luggages());
        return "luggages/caryons";
    }

}
