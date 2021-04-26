package com.habilidadesmentalidades.habilidadesmentalidades.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/habilidadesmentalidades")
public class HabilidadesmentalidadesController {

	@GetMapping
	public String habilidadesmentalidades() {
		return "Hello World! Para realizar essa atividade utilizei a persistência e a mentalidade de crescimento.";
	}
}
