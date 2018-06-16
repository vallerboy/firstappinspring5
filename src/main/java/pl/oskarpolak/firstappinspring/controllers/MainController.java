package pl.oskarpolak.firstappinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MainController {

    @GetMapping("/{age}/{name}")
    public String index(@PathVariable("age") int age,
                        @PathVariable("name") String name,
                        Model model){
        model.addAttribute("info", age >= 18 ? "Zapraszam do klubu" : "Wieczorynka o 19");
        model.addAttribute("name", name);

        return "index";
    }

}
