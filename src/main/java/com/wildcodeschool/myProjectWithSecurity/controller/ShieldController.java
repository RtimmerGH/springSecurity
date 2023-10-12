package com.wildcodeschool.myProjectWithSecurity.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ShieldController {
    @GetMapping("/")
    @ResponseBody
    public String welcome() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    @ResponseBody
    public String user() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    @ResponseBody
    public String campus() {
        return "<H2>Nos Campus</H2>\n" +
                "    <ul>\n" +
                "        <li>Bordeaux</li>\n" +
                "        <li>Nantes</li>\n" +
                "        <li>Lille</li>\n" +
                "        <li>Paris</li>\n" +
                "        <li>Lyon</li>\n" +
                "        <li>Toulouse</li>\n" +
                "    </ul>";
    }

}
