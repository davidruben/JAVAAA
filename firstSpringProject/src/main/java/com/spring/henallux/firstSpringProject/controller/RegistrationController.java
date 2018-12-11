package com.spring.henallux.firstSpringProject.controller;


import com.spring.henallux.firstSpringProject.Model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;

@Controller
public class RegistrationController {

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        model.addAttribute("user",new User());
        return "integrated:welcome";
    }



    @RequestMapping(value ="/send",method = RequestMethod.POST)
    public String saveUser(Model model, @Valid @ModelAttribute(value = "user")User user,final BindingResult errors){
        if(!errors.hasErrors())
            return "integrated:welcome";


        return "integrated:welcome";
    }
}
