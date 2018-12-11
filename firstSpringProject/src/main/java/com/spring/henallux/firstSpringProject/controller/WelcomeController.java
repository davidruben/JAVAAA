package com.spring.henallux.firstSpringProject.controller;


import com.spring.henallux.firstSpringProject.Model.Correspondant;
import com.spring.henallux.firstSpringProject.dataAccess.dao.CorrespondantDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@Controller
@RequestMapping(value = "/hello")
public class WelcomeController {

    private CorrespondantDao correspondantDao;

    @Autowired
    public WelcomeController(CorrespondantDao correspondantDao) {
        this.correspondantDao = correspondantDao;
    }

    @RequestMapping(method = RequestMethod.GET)
    public String home(Model model){
        return "integrated:welcome";
    }


    @RequestMapping(value="/categories",method = RequestMethod.GET)
    public List<Correspondant> getCategories (){
        List<Correspondant> categories = correspondantDao.getAllCategories("Francais");
        return categories;
    }
}
