package pl.oskarpolak.firstappinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.firstappinspring.models.RegisterForm;

@Controller
public class Register2Controller {


    @GetMapping("/register2")
    public String login(Model model) {
        model.addAttribute("registerForm", new RegisterForm());
        return "register2";
    }

    @PostMapping("/register2")
    @ResponseBody
    public String login(@ModelAttribute RegisterForm registerForm){
        if(registerForm.getPassword().equals(registerForm.getPasswordRepeat())){
            return "Zarejestrowano";
        }
        return "Bledne dane";
    }
}
