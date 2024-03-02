package com.example.css.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CssController {
    @GetMapping("/")
    public String home(){
        return "style_color";
    }
}
