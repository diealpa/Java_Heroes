package heroes.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import heroes.model.Heroe;
import heroes.service.HeroeService;

@Controller
//@RequestMapping(value="informacion")
public class HeroesController{
	
	@Autowired
	private HeroeService heroeService;
    
	
	@GetMapping("/")
	public String getHeros(Model model) {
		List<Heroe> heroe = heroeService.getHeroes();
		model.addAttribute("heroes",heroe);
		return "tabla";
	}
	
	@GetMapping("/eliminar")
	public String eliminar() {
		heroeService.eliminar_todos();
		return "Ha eliminado todos los superheroes de la base de datos";
	}
	
	@GetMapping("/crear")
	public String crear(Model model) {
		Heroe heroe = new Heroe();
		model.addAttribute("heroe",heroe);
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar(Heroe heroe) {
		 
		heroeService.guardar(heroe);
		
		return "redirect:/";
	}
	
	
	@GetMapping("/eliminarid")
	public String eliminacion(@RequestParam int idborrado) {
		heroeService.eliminarporid(idborrado);
		return "redirect:/";
		}
	
	
	@GetMapping("/actualizarid/{id}")
	public String actualizar(@PathVariable("id") int idactualizado, Model model) {
		 //FALTA IMPLEMENTAR, 'idactualizado' viene de la vista "tabla.html" MIRAR video 122 del curso
		
		Heroe heroe = heroeService.buscarporid(idactualizado).get();
		model.addAttribute("heroe", heroe);
		
		return"/nuevo";
	}
	

}
