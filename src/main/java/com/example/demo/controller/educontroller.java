package com.example.demo.controller;

import com.example.demo.model.flight;
import com.example.demo.service.DBservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class educontroller {

    DBservice dbs;

    @Autowired
    public educontroller(DBservice dbst) {
        this.dbs = dbst;
    }

    @GetMapping("/register")
    public String registerStudent(@RequestParam(value = "usern") String username
            , @RequestParam(value = "passwd") String password){

        flight tmp = new flight(username,password);
//        DBService dbs = new DBService();
        dbs.insert(tmp.getInsertQuery());
        System.out.println("We are going to reg "+username+password);
        return "OK";
    }


}