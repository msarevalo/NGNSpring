package co.edu.uelbosque.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="acudiente")
public class Acudiente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	private int documento;
	private String nombre;
	private String apellidos;
	private String credenciales;
	private String estudiante;
	@Temporal(TemporalType.TIMESTAMP)
	private Date fecNac;
	private int edad;
	/**
	 * 
	 */
	public Acudiente() {
	}
	/**
	 * @param documento
	 * @param nombre
	 * @param apellidos
	 * @param credenciales
	 * @param estudiante
	 * @param fecNac
	 * @param edad
	 */
	public Acudiente(long id,int documento, String nombre, String apellidos, String credenciales, String estudiante,
			Date fecNac, int edad) {
		this.id=id;
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.credenciales = credenciales;
		this.estudiante = estudiante;
		this.fecNac = fecNac;
		this.edad = edad;
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
	/**
	 * @return the estudiante
	 */
	public String getEstudiante() {
		return estudiante;
	}
	/**
	 * @param estudiante the estudiante to set
	 */
	public void setEstudiante(String estudiante) {
		this.estudiante = estudiante;
	}
	/**
	 * @return the fecNac
	 */
	public Date getFecNac() {
		return fecNac;
	}
	/**
	 * @param fecNac the fecNac to set
	 */
	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}
	/**
	 * @return the edad
	 */
	public int getEdad() {
		return edad;
	}
	/**
	 * @param edad the edad to set
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
}
