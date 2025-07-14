package com.example.deploy.controller;

import jakarta.servlet.http.HttpServletResponse;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String indexHtml(HttpServletResponse response){
        response.setStatus(200);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return """
            <!DOCTYPE html>
            <html>
                <head>
                    <title>Base</title>
                </head>
                <body>
            Hello World!
                </body>
            </html>
            """;
    }

    @GetMapping("/hello")
    public String helloHtml(HttpServletResponse response){
        response.setStatus(200);
        response.setHeader("Access-Control-Allow-Origin", "*");
        return "I`m from backend!";
    }
}
