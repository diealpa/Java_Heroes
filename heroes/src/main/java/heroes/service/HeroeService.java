package heroes.service;
import java.util.List;

import heroes.model.Heroe;

public interface HeroeService {
	
	public List<Heroe> getHeroes();
	public void eliminar_todos();
    public void guardar(Heroe heroe);
    public void eliminarporid(Integer idHeroe);

}
