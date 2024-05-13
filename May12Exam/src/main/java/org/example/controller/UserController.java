package org.example.controller;

import org.example.model.UserModel;
import org.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping(value = "/user")
public class UserController {

    @Autowired
    private UserService userService;

    public String saveUserInfo(@ModelAttribute UserModel userModel) {
        System.out.println("Receive UserModel: " + userModel);
        this.userService.saveUserData(userModel);
        return null;

    }

}
