package pe.edu.upeu.lpower.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class HomeController {
	@GetMapping("/")
	public String mensaje() {
		return "Bienvenido al Sistema de Ventas";
	  }
}