package pl.oskarpolak.firstappinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RegisterController {


    @GetMapping("/register")
    public String login() {
        return "register";
    }

    @PostMapping("/register")
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password,
                        @RequestParam("passwordRepeat") String passwordRepeat,
                        @RequestParam("email") String email,
                        Model model){
        if(password.equals(passwordRepeat)){
            model.addAttribute("hasAccountCreated", true);
            return "register";
        }
        model.addAttribute("hasAccountCreated", false);
        return "register";
    }
}
