package heroes.service;


import static org.assertj.core.api.Assertions.assertThat;

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
void test(){
	heroe.setId(idtest);  
	Assertions.assertEquals(service.existeId(heroe.getId()), ("1"));

		  }

@Test
public void whenEliminate() {
	
 assertThat(service.eliminarTodos()).isNotNull();
}


}



