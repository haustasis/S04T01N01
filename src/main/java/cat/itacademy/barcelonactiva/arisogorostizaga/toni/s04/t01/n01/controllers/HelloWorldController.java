package cat.itacademy.barcelonactiva.arisogorostizaga.toni.s04.t01.n01.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	@GetMapping("/HelloWorld")
	public String saluda(@RequestParam(value = "nom", defaultValue = "UNKNOWN") String nom) {
		return String.format("Hola, %s. Estàs executant un projecte Maven.", nom);
	}
	
	@GetMapping(value = {"/HelloWorld2", "/HelloWorld2/{nom}"})
	public String saluda2(@PathVariable(required = false) String nom) {
		if(nom == null) {
			nom = "UNKNOWN";
		}
		return String.format("Hola, %s. Estàs executant un projecte Maven.", nom);
	}

}
