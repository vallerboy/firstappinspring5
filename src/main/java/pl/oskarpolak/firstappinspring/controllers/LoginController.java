package pl.oskarpolak.firstappinspring.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class LoginController {


    @GetMapping("/login")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    @ResponseBody
    public String login(@RequestParam("login") String login,
                        @RequestParam("password") String password){
        if(login.equals("admin") && password.equals("admin")){
            return "Zalogowano";
        }

        return "Błędne dane";
    }
}
