package heroes.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name="heroes")
public class Heroe {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;	
	
	@Column(name="nombre")
	private String nombre;

	@Column(name="superpoder")
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
