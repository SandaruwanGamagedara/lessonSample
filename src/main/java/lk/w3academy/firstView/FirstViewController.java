package lk.w3academy.firstView;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstViewController {

    @GetMapping("/firstView")
    public String firstView(Model model) {
        model.addAttribute("name", "Lalith");
        // name Lalith
        return "first/firstView";
    }
}
