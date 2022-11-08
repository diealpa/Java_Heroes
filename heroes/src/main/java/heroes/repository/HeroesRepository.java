package heroes.repository;

import org.springframework.data.repository.CrudRepository;

import heroes.model.Heroe;

public interface HeroesRepository extends CrudRepository<Heroe, Integer> {

}
