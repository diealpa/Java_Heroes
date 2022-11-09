package heroes.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import heroes.model.Heroe;
import heroes.repository.HeroesRepository;

@Service
public class HeroeServiceImplement implements HeroeService  {

	@Autowired
	private HeroesRepository repo;
	
	public List<Heroe> getHeroes() {
		return (List<Heroe>) repo.findAll();
	}

	@Override
	public void eliminar_todos() {
		repo.deleteAll();
		
	}

	@Override
	public void guardar(Heroe heroe) {
		repo.save(heroe);
		
	}

	@Override
	public void eliminarporid(Integer idHeroe) {
		repo.deleteById(idHeroe);
		
	}

	 
	
	

}