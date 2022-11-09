package heroes.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import heroes.model.Heroe;
import heroes.service.HeroeService;

@Controller
//@RequestMapping(value="informacion")
public class HeroesController{
	
	@Autowired
	private HeroeService heroeService;
    
	
	@GetMapping("/listado")
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
	public String crear() {
		return "nuevo";
	}
	
	@PostMapping("/guardar")
	public String guardar(@RequestParam("id")Integer id,@RequestParam("nombre")String nombre,@RequestParam("superpoder")String superpoder) {
		Heroe heroe = new Heroe();
		heroe.setId(id); 
		heroe.setNombre(nombre);
		heroe.setSuperpoder(superpoder);
		heroeService.guardar(heroe);
		
		return "redirect:/listado";
	}
	
	
	@GetMapping("/eliminarid")
	public String fuera(@RequestParam int idborrado) {
		heroeService.eliminarporid(idborrado);
		return "redirect:/listado";
		}
	
	
	
	
	
	/*
	
	@GetMapping("/detalle")
	public String mostrarDetalle(Model model) {
		Heroe heroe = new Heroe();
		heroe.setNombre("Aquaman");
		heroe.setSuperpoder("Controlador del mar");
		model.addAttribute("detallesheroe",heroe);
		return "detalle";
	}
	
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
	*/
	
	
	
	
}
