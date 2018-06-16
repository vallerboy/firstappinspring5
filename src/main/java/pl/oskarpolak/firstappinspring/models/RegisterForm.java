package pl.oskarpolak.firstappinspring.models;

import lombok.Data;

@Data
public class RegisterForm {
    private String login;
    private String password;
    private String passwordRepeat;
    private String email;
}
