package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="materia")
public class Materia {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idMateria;
	private String nombreMateria;
	/**
	 * 
	 */
	public Materia() {
	}
	/**
	 * @param idMateria
	 * @param nombreMateria
	 */
	public Materia(long idMateria, String nombreMateria) {
		this.idMateria = idMateria;
		this.nombreMateria = nombreMateria;
	}
	/**
	 * @return the idMateria
	 */
	public long getIdMateria() {
		return idMateria;
	}
	/**
	 * @param idMateria the idMateria to set
	 */
	public void setIdMateria(long idMateria) {
		this.idMateria = idMateria;
	}
	/**
	 * @return the nombreMateria
	 */
	public String getNombreMateria() {
		return nombreMateria;
	}
	/**
	 * @param nombreMateria the nombreMateria to set
	 */
	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}
	
	
	

}
