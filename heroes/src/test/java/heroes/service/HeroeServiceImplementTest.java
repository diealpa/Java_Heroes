package heroes.service;


import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.test.context.SpringBootTest;

import heroes.model.Heroe;



@SpringBootTest
public class HeroeServiceImplementTest {
		
@Value("${1}")
	Integer idtest;



@Test
void test(){
	Heroe heroe = new Heroe();
		heroe.setId(idtest);
		HeroeServiceImplement service = new HeroeServiceImplement();
		
	Assertions.assertEquals(service.existeId(heroe.getId()), ("1"));

		  }


}



