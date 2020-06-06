package lk.w3academy.newSample.controller;



import lk.w3academy.newSample.entity.SampleOne;
import lk.w3academy.newSample.service.SampleOneService;
import lk.w3academy.util.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;


@Controller
@RequestMapping("/sampleOne")
public class SampleOneController implements AbstractController<SampleOne, Integer> {
    private final SampleOneService sampleOneService;

    public SampleOneController(SampleOneService sampleOneService) {
        this.sampleOneService = sampleOneService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("all", sampleOneService.findAll());
        return "sampleOne/sampleOne";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        model.addAttribute("sampleOne", sampleOneService.findById(id));
        return "sampleOne/sampleOne-Detail";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        return null;
    }

    @PostMapping("/save")
    public String persist(@ModelAttribute SampleOne sampleOne, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        sampleOneService.persist(sampleOne);
        return "redirect:/sampleOne";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        sampleOneService.delete(id);
        return "redirect:/sampleOne";
    }


    public String form(Model model) {
        model.addAttribute("sampleOne", new SampleOne());
        return "sampleOne/addSampleOne";
    }
}
