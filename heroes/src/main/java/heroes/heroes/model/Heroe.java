package heroes.heroes.model;

import javax.persistence.Entity;
import javax.persistence.Table;

//mirar esto para base de datos H2
//@Entity
//@Table(name="heroe")
public class Heroe {
	
	private Integer id;
	private String nombre;
	private String superpoder;
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getSuperpoder() {
		return superpoder;
	}
	public void setSuperpoder(String superpoder) {
		this.superpoder = superpoder;
	}
	
	@Override
	public String toString() {
		return "Heroe [id=" + id + ", nombre=" + nombre + ", superpoder=" + superpoder + "]"; 
		
	}
	
	
	

}
