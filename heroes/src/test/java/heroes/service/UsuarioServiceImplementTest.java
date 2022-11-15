package heroes.service;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import heroes.model.Usuario;

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
		
		assertTrue(usua.getClave().equalsIgnoreCase("clave"));
	}
	
	


}



