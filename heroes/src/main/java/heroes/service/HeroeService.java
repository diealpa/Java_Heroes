package heroes.service;
import java.util.List;
import java.util.Optional;

import heroes.model.Heroe;

public interface HeroeService {
	
	public List<Heroe> getHeroes();
    public void guardar(Heroe heroe);
    public void eliminarTodos();
    public void eliminarPorId(Integer idHeroe);
    public Optional<Heroe> buscarPorId(Integer idHeroe);
    boolean existeId(Integer id);
    public List<Heroe> buscarTodos(String busqueda);

}
