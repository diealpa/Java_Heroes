package heroes.repository;

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
		
		repo.save(usua);
	}

}
