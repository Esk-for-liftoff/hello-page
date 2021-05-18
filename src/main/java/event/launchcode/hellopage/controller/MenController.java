package event.launchcode.hellopage.controller;

import event.launchcode.hellopage.model.MenItems;
import event.launchcode.hellopage.model.data.MenRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MenController {
    @Autowired
    private static MenRepository menRepository;

    @GetMapping("hats")
    public String hatsModel(Model model) {
        model.addAttribute(new MenItems());
        return "men/hats";
    }

    @GetMapping("pants")
    public String pantsModel(Model model) {
        model.addAttribute(new MenItems());
        return "men/pants";
    }

    @GetMapping("shoes")
    public String shoesModels(Model model) {
        model.addAttribute(new MenItems());
        return "men/shoes";
    }

    @GetMapping("t-shirt")
    public String shirtModels(Model model) {
        model.addAttribute(new MenItems());
        return "men/t-shirt";
    }
}