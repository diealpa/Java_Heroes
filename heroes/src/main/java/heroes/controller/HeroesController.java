package heroes.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import heroes.model.Heroe;
import heroes.service.HeroeService;

@Controller
public class HeroesController{
	
	@Autowired
	private HeroeService heroeService;
    
	
	@GetMapping("/")
	public String getHeros(Model model, @Param("busqueda") String busqueda) {
		List<Heroe> heroe = heroeService.buscarTodos(busqueda);
		
		model.addAttribute("heroes",heroe);
		model.addAttribute("busqueda",busqueda);
		
		return "tabla";
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
		heroeService.eliminarPorId(idborrado);
		return "redirect:/";
		}
	
	@GetMapping("/eliminarTodos")
	public String eliminar() {
		heroeService.eliminarTodos();
		return "redirect:/";	
	}
	
	
	@GetMapping("/actualizarid/{id}")
	public String actualizar(@PathVariable("id") int idactualizado, Model model) {
		 //FALTA IMPLEMENTAR, 'idactualizado' viene de la vista "tabla.html" MIRAR video 122 del curso
		
		Heroe heroe = heroeService.buscarPorId(idactualizado).get();
		model.addAttribute("heroe", heroe);
		
		return"/nuevo";
	}
	

}
