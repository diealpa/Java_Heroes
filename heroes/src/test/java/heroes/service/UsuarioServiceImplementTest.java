package heroes.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import heroes.model.Usuario;
import heroes.repository.UsuarioRepository;

@SpringBootTest
public class UsuarioServiceImplementTest {
	
	@Autowired
	UsuarioServiceImplement service;
	
	@Test
	public void crearUsuarioTest() { 
		Usuario usua = new Usuario();
		usua.setId(0);
		usua.setNombre("pepe");
		usua.setClave("clave");
		
		service.crearUsuario(usua);
	}
	
	


}



