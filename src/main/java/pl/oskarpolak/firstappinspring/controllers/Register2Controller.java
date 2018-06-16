package pl.oskarpolak.firstappinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import pl.oskarpolak.firstappinspring.models.RegisterForm;

@Controller
public class Register2Controller {


    @GetMapping("/register2")
    public String login(Model model) {
        RegisterForm registerForm = new RegisterForm();
        model.addAttribute("registerForm", registerForm);
        return "register2";
    }

    @PostMapping("/register2")
    public String login(@ModelAttribute RegisterForm registerForm){
        if(registerForm.getPassword().equals(registerForm.getPasswordRepeat())){
            return "redirect:/login";
        }
        return "register2";
    }
}
