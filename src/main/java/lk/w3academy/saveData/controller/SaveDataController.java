package lk.w3academy.saveData.controller;


import lk.w3academy.saveData.entity.SaveData;
import lk.w3academy.saveData.service.SaveDataService;
import lk.w3academy.util.AbstractController;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.validation.Valid;

@Controller
@RequestMapping("/saveData")
public class SaveDataController implements AbstractController<SaveData, Integer> {
    private final SaveDataService saveDataService;

    public SaveDataController(SaveDataService saveDataService) {
        this.saveDataService = saveDataService;
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("all", saveDataService.findAll());
        return "saveData/saveData";
    }

    @GetMapping("/{id}")
    public String findById(@PathVariable Integer id, Model model) {
        model.addAttribute("saveData", saveDataService.findById(id));
        return "saveData/saveData-Detail";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        return null;
    }

    @PostMapping("/save")
    public String persist(@Valid @ModelAttribute SaveData saveData, BindingResult bindingResult, RedirectAttributes redirectAttributes, Model model) {
        saveDataService.persist(saveData);
        return "redirect:/saveData";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id, Model model) {
        saveDataService.delete(id);

        return "redirect:/saveData";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("saveData", new SaveData());
        return "saveData/addSaveData";
    }
}
