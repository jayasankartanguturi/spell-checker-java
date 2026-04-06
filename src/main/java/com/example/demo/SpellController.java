package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import java.util.*;

@Controller
public class SpellController {

    private final SpellService service;

    public SpellController(SpellService service) {
        this.service = service;
    }

    @GetMapping("/")
    public String home() {
        return "index";
    }

    @PostMapping("/check")
    public String check(@RequestParam String word, Model model) {

        List<Map<String,Object>> suggestions = service.getSuggestions(word);

        model.addAttribute("word", word);
        model.addAttribute("suggestions", suggestions);

        return "index";
    }
}