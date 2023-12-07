package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

	@GetMapping
	public String hello() {
		return "BEM VINDO A <b>SERIE B</b> SANTASTICO!!!";
	}
	
	@GetMapping("/bsm")
	public String bsm() {
		return "Responsabilidade Pessoal<br>Mentalidade de Crescimento<br>Orientação ao Futuro<br>Persistência<br>Comunicação<br>Atenção para Detalhes<br>"
				+ "Trabalho em Equipe<br>Proatividade\r\n<br>Utilizar as Boas Práticas<br>Executar Testes<br>Aprender Novas Habilidades<br>Comunicar-se e Colaborar com os Participantes";
	}
	@GetMapping("/bsmmeu")
	public String bsmmeu() {
		return "Meus objetivos de aprendizado essa semana é o trabalho em equipe, orientação aos detalhes e a comunicação";
	}
}
