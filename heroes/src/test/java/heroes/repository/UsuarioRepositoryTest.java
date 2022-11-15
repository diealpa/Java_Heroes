package heroes.repository;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import heroes.model.Usuario;


@SpringBootTest
public class UsuarioRepositoryTest {
	
	@Autowired
	UsuarioRepository repo;
	
	@Test
	public void crearUsuarioTest() { 
		Usuario usua = new Usuario();
		usua.setId(0);
		usua.setNombre("pepe");
		usua.setClave("clave");
		
		Usuario usuario2 = repo.save(usua);
		
		assertTrue(usua.getClave().equalsIgnoreCase(usuario2.getNombre()));

	}

}
