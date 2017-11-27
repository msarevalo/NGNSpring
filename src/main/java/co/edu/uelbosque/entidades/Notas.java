package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="notas")

public class Notas {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long id;
	
	private String nombre;
	private int primerPeriodo;
	private int segundoPeriodo;
	private int tercerPeriodo;
	private int cuartoPeriodo;
	private int definitiva;
	/**
	 * 
	 */
	public Notas() {
	}
	/**
	 * @param id
	 * @param nombre
	 * @param primerPeriodo
	 * @param segundoPeriodo
	 * @param tercerPeriodo
	 * @param cuartoPeriodo
	 * @param definitiva
	 */
	public Notas(long id, String nombre, int primerPeriodo, int segundoPeriodo, int tercerPeriodo, int cuartoPeriodo,
			int definitiva) {
		this.id = id;
		this.nombre = nombre;
		this.primerPeriodo = primerPeriodo;
		this.segundoPeriodo = segundoPeriodo;
		this.tercerPeriodo = tercerPeriodo;
		this.cuartoPeriodo = cuartoPeriodo;
		this.definitiva = definitiva;
	}
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the primerPeriodo
	 */
	public int getPrimerPeriodo() {
		return primerPeriodo;
	}
	/**
	 * @param primerPeriodo the primerPeriodo to set
	 */
	public void setPrimerPeriodo(int primerPeriodo) {
		this.primerPeriodo = primerPeriodo;
	}
	/**
	 * @return the segundoPeriodo
	 */
	public int getSegundoPeriodo() {
		return segundoPeriodo;
	}
	/**
	 * @param segundoPeriodo the segundoPeriodo to set
	 */
	public void setSegundoPeriodo(int segundoPeriodo) {
		this.segundoPeriodo = segundoPeriodo;
	}
	/**
	 * @return the tercerPeriodo
	 */
	public int getTercerPeriodo() {
		return tercerPeriodo;
	}
	/**
	 * @param tercerPeriodo the tercerPeriodo to set
	 */
	public void setTercerPeriodo(int tercerPeriodo) {
		this.tercerPeriodo = tercerPeriodo;
	}
	/**
	 * @return the cuartoPeriodo
	 */
	public int getCuartoPeriodo() {
		return cuartoPeriodo;
	}
	/**
	 * @param cuartoPeriodo the cuartoPeriodo to set
	 */
	public void setCuartoPeriodo(int cuartoPeriodo) {
		this.cuartoPeriodo = cuartoPeriodo;
	}
	/**
	 * @return the definitiva
	 */
	public int getDefinitiva() {
		return definitiva;
	}
	/**
	 * @param definitiva the definitiva to set
	 */
	public void setDefinitiva(int definitiva) {
		this.definitiva = definitiva;
	}
	
	
}
