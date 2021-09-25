package com.hahaworld.Haha.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/haha")
public class HahaController {
	
	@GetMapping
	public String hello() {
		return "\nHaha World! \n Eu utilizei as seguintes mentalidades: \n1- Pestiência \n2- Atenção aos detalhes";
	}
}
