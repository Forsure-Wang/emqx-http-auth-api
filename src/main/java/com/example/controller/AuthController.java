package com.example.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;

@RestController
@RequestMapping("/mqtt")
public class AuthController {
    @RequestMapping("/test")
    public String test () {
        System.out.println("hello");
        return "hello";
        //response.setStatus(200);
    }
    @RequestMapping("/auth")
    public void emqxHttpAuth (String clientid, String username, String password, HttpServletResponse response) {
        System.out.println("auth api");
        System.out.println(" "+clientid+" "+username+" "+password);
        response.setStatus(200);
    }

    @RequestMapping("/acl")
    public void emqxHttpAcl (String clientid, String username, HttpServletResponse response) {
        System.out.println("acl api");
        System.out.println(" "+clientid+" "+username);
        response.setStatus(200);
    }

    @RequestMapping("/superuser")
    public void emqxHttpSuperUser (String clientid, String username, HttpServletResponse response) {
        System.out.println("superuser api");
        System.out.println(" "+clientid+" "+username);
        response.setStatus(200);
    }
}
