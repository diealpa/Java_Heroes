package heroes.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import heroes.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}