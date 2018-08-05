package com.example.tl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by jakimarks on 11.11.14.
 */
@Controller
public class SampleController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("message", "HELLO!");
        return "hello";
    }
}
