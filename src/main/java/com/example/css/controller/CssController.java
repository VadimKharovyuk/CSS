package com.example.css.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller

public class CssController {
    @GetMapping("/")
    public String home(){
        return "style_color";
    }
    @GetMapping("/two")
    public String tho(){
        return "class_id";
    }
    @GetMapping("/three")
    public String three (){
        return "border";
    }
    @GetMapping("/display")
    public String display(){
        return "display";
    }
}
