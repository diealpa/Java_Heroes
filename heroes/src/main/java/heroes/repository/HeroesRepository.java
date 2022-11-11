package heroes.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import heroes.model.Heroe;

public interface HeroesRepository extends JpaRepository<Heroe, Integer> {
	
	@Query("select h from Heroe h where h.nombre = ?1")
	public List<Heroe> buscarTodos(String busqueda);

}
