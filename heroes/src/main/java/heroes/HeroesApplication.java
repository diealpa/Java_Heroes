package heroes;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import heroes.model.Heroe;
import heroes.repository.HeroesRepository;

@SpringBootApplication
public class HeroesApplication {
	
	@Autowired
	private HeroesRepository reposi;

	public static void main(String[] args) {
		SpringApplication.run(HeroesApplication.class, args);
	}
	
	public void run(String... args) throws Exception{
		guardar();
	}
	
	private void guardar() {
		Heroe heroe = new Heroe();
		heroe.setNombre("Spiderman");
		heroe.setSuperpoder("Telarañas y volar");
		
		reposi.save(heroe);
	}

}
