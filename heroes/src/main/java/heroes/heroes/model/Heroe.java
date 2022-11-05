package heroes.heroes.model;

//import javax.persistence.Column;
//import javax.persistence.Entity;
//import javax.persistence.Id;
//import javax.persistence.Table;


//@Entity
//@Table(name="heroes")
public class Heroe {
	
	//@Id
	//@Column(name="heroe_id")
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
