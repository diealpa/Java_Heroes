package heroes.service;
import java.util.List;
import java.util.Optional;

import heroes.model.Heroe;

public interface HeroeService {
	
	public List<Heroe> getHeroes();
	public void eliminar_todos();
    public void guardar(Heroe heroe);
    public void eliminarporid(Integer idHeroe);
    public Optional<Heroe> buscarporid(Integer idHeroe);

}
