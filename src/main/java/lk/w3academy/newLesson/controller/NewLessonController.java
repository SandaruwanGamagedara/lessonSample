package lk.w3academy.newLesson.controller;

import lk.w3academy.newLesson.entity.NewLesson;
import lk.w3academy.newLesson.service.NewLessonService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/newLesson")
public class NewLessonController {

    private final NewLessonService newLessonService;

    public NewLessonController(NewLessonService newLessonService) {
        this.newLessonService = newLessonService;
    }

    @GetMapping(value = "/new")
    public String form(Model model) {
        model.addAttribute("newLesson", new NewLesson());
        return "newLesson/addNewLesson";
    }

    @PostMapping("/save")
    public String persist(@ModelAttribute NewLesson newLesson) {
        System.out.println("came new lesson " + newLesson.toString());
        System.out.println("saved new lesson" + newLessonService.persist(newLesson));
        return "redirect:/newLesson";
    }

    @GetMapping
    public String findAll(Model model) {
        model.addAttribute("newLessons", newLessonService.findAll());
        return "newLesson/newLesson";
    }
    @GetMapping("/view/{id}")
    public String findById(@PathVariable("id") Integer id, Model model){
        model.addAttribute("newLessonDetail",newLessonService.findById(id));
        return "newLesson/newLesson-Detail";
    }

    @GetMapping("/edit/{id}")
    public String edit(@PathVariable("id") Integer id, Model model){
        model.addAttribute("newLesson", newLessonService.findById(id));
        model.addAttribute("addState",true);
        return "newLesson/addNewLesson";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable("id") Integer id){
        newLessonService.delete(id);
        return "redirect:/newLesson";
    }
    //todo
    //HTTP request (GET, POST, DELETE, PUT, ...)
    //1.findAll
    //2.findById
    //3.persist
    //4.delete
    //5.form


/*    public static void main(String[] args) {
        abc();
    }

    private static void abc(){
        System.out.println("reereree");
    }*/

}
