package it.corso.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import it.corso.service.AttivitaService;


@Controller
@RequestMapping("/logged")
public class loggedController {
	@Autowired
	private AttivitaService attivitaService;
	
	@GetMapping
	public String getPage(Model model) {
		
		
		
		
		return "loggedController";
	}

}
