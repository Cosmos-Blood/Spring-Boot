package com.Aula2.Exercicio02;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/02")
public class ExerController {
	@GetMapping
	
	public String exer() {
		return "Esta semana está no fim então só pretendo revisar todos os conceitos aprendidos.";
	}
}
