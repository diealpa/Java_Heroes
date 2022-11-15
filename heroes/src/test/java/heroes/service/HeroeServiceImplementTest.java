package heroes.service;


import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import heroes.model.Heroe;



@SpringBootTest
public class HeroeServiceImplementTest {
	
	Heroe heroe;
	HeroeService service; 
	@Value("${1}")
	Integer idtest; 


	@Test
	void testExisteId(){
		heroe.setId(idtest);  
		Assertions.assertEquals(service.existeId(heroe.getId()), 1); 
	}

	@Test
	public void testBuscarTodos() {
		
		service.eliminarTodos();
		
		Heroe sup = new Heroe();
		sup.setId(19);
		sup.setNombre("Pantera Negra");
		sup.setSuperpoder("Super traje");
		
		assertEquals(1, service.buscarTodos("").size());
	}
	
	@Test
	public void testEliminarTodos() {
		Heroe heroe2 = new Heroe();
		heroe2.setId(5);
		heroe2.setNombre("Hombre Araña");
		heroe2.setSuperpoder("Volar");
		
		service.guardar(heroe2); 
		service.eliminarTodos();
		
		assertEquals(0, service.buscarTodos("").size()); 
		
	}


}



