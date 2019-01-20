package br.com.sejadev.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import br.com.sejadev.spring.model.Saudacoes;

@Controller
public class HelloWorldController {
	
	@RequestMapping("/")
	@ResponseBody
	public Saudacoes helloWorld() {
		return new Saudacoes("01", "Hello, World");
	}
	
}
