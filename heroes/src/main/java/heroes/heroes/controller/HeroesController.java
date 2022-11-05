package heroes.heroes.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroesController {
	
	@GetMapping("/")
	public String MostrarHome(Model model) {
		model.addAttribute("mensaje", "Que pasa loco");
		model.addAttribute("fecha", new Date());

		return "home"; 
	}
	
	@GetMapping("/listado")
	public String mostrarListado(Model model) {
		List<String> lista = new LinkedList<String>();
		lista.add("Superman");
		lista.add("Spiderman");
		lista.add("Iron Man");
		
		model.addAttribute("heroes", lista);
		
		return"listado";
		
		}
}
