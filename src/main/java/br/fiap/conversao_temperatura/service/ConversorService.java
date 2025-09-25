package br.fiap.conversao_temperatura.service;

import org.springframework.stereotype.Service;

@Service
public class ConversorService {
    public double paraFahrenheit(double celsius){
        return celsius * 9 / 5 + 32;
    }
}
