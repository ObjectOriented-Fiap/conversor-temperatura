package br.fiap.conversao_temperatura.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversorController {

    @PostMapping("/converter")
    public String converter(@RequestParam double celsius, Model model){
        double fahrenheit = celsius * 9 / 5 + 32;
        model.addAttribute("fahrenheit",fahrenheit);
        model.addAttribute("celsius",celsius);
        return "index";
    }
}
