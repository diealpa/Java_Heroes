package heroes.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import heroes.model.Heroe;
import heroes.service.HeroeService;

@RestController
//@RequestMapping(value="informacion")
public class HeroesController{
	
	@Autowired
	private HeroeService heroeService;
    
	
	@GetMapping("/listado")
	public List<Heroe> getTasks() {
		return heroeService.getHeroes();
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
