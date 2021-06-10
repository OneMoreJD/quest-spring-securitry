package com.wildcodeschool.springsecurity.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ShieldController {

    @GetMapping("/")
    @ResponseBody
    public String home() {
        return "Welcome to the SHIELD";
    }

    @GetMapping("/avengers/assemble")
    @ResponseBody
    public String avengers() {
        return "Avengers... Assemble";
    }

    @GetMapping("/secret-bases")
    @ResponseBody
    public String bases() {
        String[] bases = {
                "Amsterdam",
                "Barcelone",
                "Berlin",
                "Biarritz",
                "Bordeaux",
                "Bruxelles",
                "Bucarest",
                "La loupe",
                "Lille",
                "Lisbonne",
                "Londres",
                "Lyon",
                "Madrid",
                "Marseille",
                "Nantes",
                "Orléans",
                "Paris",
                "Reims",
                "Saintes",
                "Strasbourg",
                "Toulouse",
                "Tours"
        };

        String html = "<html>\n" +
                "<header><title>Les bases du shield</title></header>\n" +
                "<body>\n" +
                "<ul>\n" ;
        
        for (int i = 0; i < bases.length; i++) {
            html += "<li>" + bases[i] + "</li>\n";
        }
        
        html += "</ul>\n" +
                "</body>\n" +
                "</html>";

        return html;
    }
}
