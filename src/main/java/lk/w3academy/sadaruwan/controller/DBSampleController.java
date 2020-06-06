package lk.w3academy.sadaruwan.controller;

import lk.w3academy.sadaruwan.entity.DBSample;
import lk.w3academy.sadaruwan.service.DBSampleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/dbSample")
public class DBSampleController {
    private final DBSampleService dbSampleService;

    @Autowired
    public DBSampleController(DBSampleService dbSampleService) {
        this.dbSampleService = dbSampleService;
    }

    @GetMapping
    public String findAll(Model model){
        model.addAttribute("dbSamples", dbSampleService.findAll());
        return "sadaruwan/DBSample";
    }


    //CRUD

    @GetMapping("/add") //fontend form
    public String form(Model model) {
        model.addAttribute("dbSample", new DBSample());
        return "sadaruwan/addDBSample";
    }

    //create
    @PostMapping("/save")
    public String persist(@ModelAttribute DBSample dbSample) {
        dbSampleService.persist(dbSample);
        return "redirect:/dbSample";
    }

    // read
    @GetMapping("/view/{id}")
    public String view(@PathVariable Integer id, Model model) {
        model.addAttribute("DBSample", dbSampleService.findById(id));
        return "sadaruwan/DBSample-detail";
    }

    //edit
    @GetMapping("/edit/{id}")
    public String edit(@PathVariable Integer id, Model model) {
        model.addAttribute("dbSample", dbSampleService.findById(id));
        model.addAttribute("addState", true);
        return "sadaruwan/addDBSample";
    }

    //delete
    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        dbSampleService.delete(id);
        return "redirect:/dbSample";
    }
}
