package heroes.heroes.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeroesController {
	
	@GetMapping("/")
	public String MostrarHome() {
		return "home";
	}
}
