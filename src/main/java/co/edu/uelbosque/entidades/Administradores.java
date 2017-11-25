package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="administradores")
public class Administradores {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int documento;
	private String nombre;
	private String apellidos;
	private String credenciales;
	/**
	 * 
	 */
	public Administradores() {
	}
	/**
	 * @param documento
	 * @param nombre
	 * @param apellidos
	 * @param credenciales
	 */
	public Administradores(long id,int documento, String nombre, String apellidos, String credenciales) {
		this.id=id;
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.credenciales = credenciales;
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
	 * @return the documento
	 */
	public int getDocumento() {
		return documento;
	}
	/**
	 * @param documento the documento to set
	 */
	public void setDocumento(int documento) {
		this.documento = documento;
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
	 * @return the apellidos
	 */
	public String getApellidos() {
		return apellidos;
	}
	/**
	 * @param apellidos the apellidos to set
	 */
	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}
	/**
	 * @return the credenciales
	 */
	public String getCredenciales() {
		return credenciales;
	}
	/**
	 * @param credenciales the credenciales to set
	 */
	public void setCredenciales(String credenciales) {
		this.credenciales = credenciales;
	}
	
	
}
