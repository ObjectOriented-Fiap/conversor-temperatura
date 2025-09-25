package br.fiap.conversao_temperatura.controller;

import br.fiap.conversao_temperatura.service.ConversorService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class ConversorController {

    private final ConversorService service;

    public ConversorController (ConversorService service){
    this.service = service;
    }

    @PostMapping("/converter")
    public String converter(@RequestParam double celsius, Model model){
        double fahrenheit = service.paraFahrenheit(celsius);
        model.addAttribute("fahrenheit",fahrenheit);
        model.addAttribute("celsius",celsius);
        return "index";
    }
}
