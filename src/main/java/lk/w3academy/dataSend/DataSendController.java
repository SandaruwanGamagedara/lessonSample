package lk.w3academy.dataSend;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.List;

@Controller
public class DataSendController {
    int abc = 0;
    List<String> sendData = new ArrayList<>();

    @GetMapping("/requestForm")
    public String sendFromToFrontend(Model model) {
        model.addAttribute("arraySize", sendData.size());
        model.addAttribute("saveDate", sendData);
        return "dataSend/requestForm";
    }

    @PostMapping("/requestForm")
    public String saveData(@RequestParam(value = "name") String abc) {
        /*     @ModelAttribute (Entity or class),    @PathVariable,    @RequestParam    */
        System.out.println(abc);
        sendData.add(abc);

   /*
        System.out.println("available string count on list " + sendData.size());
        System.out.println("-------------------------------------------");
        for (String sendDatum : sendData) {
            System.out.println(sendDatum);
        }
        System.out.println("-------------------------------");
        for (String s : sendData) {
            System.out.println(s);
        }
        System.out.println("--------------------------------");
        sendData.forEach(System.out::println);*/
        return "redirect:/requestForm";
    }

}
