package com.example.deploy.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @GetMapping("/")
    public String indexHtml(){
        return """
            <!DOCTYPE html>
            <html>
                <head>
                    <title>Basic Web Page</title>
                </head>
                <body>
            Hello World!
                </body>
            </html>
            """;
    }
}
