package heroes.service;

import java.util.List;
import java.util.Optional;

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
	public void guardar(Heroe heroe) {
		repo.save(heroe);
		
	}

	@Override
	public void eliminarPorId(Integer idHeroe) {
		repo.deleteById(idHeroe);
		
	}

	@Override
	public Optional<Heroe> buscarPorId(Integer idHeroe) {
		 return repo.findById(idHeroe);
		
	}

	@Override
	public boolean existeId(Integer id) {
		
		return repo.existsById(id);
	}
	
	@Override
	public List<Heroe> buscarTodos(String busqueda){
		if(busqueda != null) {
			repo.buscarTodos(busqueda);
			return repo.buscarTodos(busqueda);
		}
		
		return repo.findAll();
	}


	@Override
	public void eliminarTodos() { 
		repo.deleteAllInBatch();
	}

	 
	
	

}
