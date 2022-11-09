package heroes.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import heroes.model.Heroe;

public interface HeroesRepository extends JpaRepository<Heroe, Integer> {

}
