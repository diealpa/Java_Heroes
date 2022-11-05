package heroes.controller;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import heroes.model.Heroe;

@Controller
public class HeroesController{

	@GetMapping("/tabla")
	public String mostrarTabla(Model model) {
		List<Heroe> lista = getHeroes();
		model.addAttribute("supers",lista);
		
		return "tabla";
	}
	
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
	
	private List<Heroe> getHeroes(){
		
		List<Heroe> superlista = new LinkedList<Heroe>();
		
		//SuperHeroe 1
		Heroe heroe2 = new Heroe();
		heroe2.setId(1);
		heroe2.setNombre("Capitan America");
		heroe2.setSuperpoder("Inmortalidad");
		
		//SuperHeroe 2
		Heroe heroe3 = new Heroe();
		heroe3.setId(2);
		heroe3.setNombre("Thor");
		heroe3.setSuperpoder("Dios del trueno");
		
		//SuperHeroe 3
		Heroe heroe4 = new Heroe();
		heroe4.setId(3);
		heroe4.setNombre("Ojo de halcon");
		heroe4.setSuperpoder("Punteria con el arco");
		
		//SuperHeroe 4
		Heroe heroe5 = new Heroe();
		heroe5.setId(4);
		heroe5.setNombre("Viuda negra");
		heroe5.setSuperpoder("Habilidad de espia");
		
		superlista.add(heroe2);
		superlista.add(heroe3);
		superlista.add(heroe4);
		superlista.add(heroe5);
		
		return superlista;
		
	}
	
	
}
