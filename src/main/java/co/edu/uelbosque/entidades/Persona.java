package co.edu.uelbosque.entidades;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity
@Table(name="personas")

public class Persona {
	
	
	private String tipoDocumento;
	@Id
	private Long documento;
	private String nombre;
	private String apellidos;
	private String genero;
	private String telefono;
	private String direccion;
	private String correo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecNac;
	
	public Persona () {}
	
	public Persona(Long documento, String nombre, String apellidos, String correo, Date fecNac, String tipoDocumento, String genero, String telefono, String direccion) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fecNac = fecNac;
		this.tipoDocumento = tipoDocumento;
		this.genero = genero;
		this.telefono = telefono;
		this.direccion = direccion;
	}
	
	

	

	public Long getDocumento() {
		return documento;
	}

	public void setDocumento(Long documento) {
		this.documento = documento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public Date getFecNac() {
		return fecNac;
	}

	public void setFecNac(Date fecNac) {
		this.fecNac = fecNac;
	}

	/**
	 * @return the tipoDocumento
	 */
	public String getTipoDocumento() {
		return tipoDocumento;
	}

	/**
	 * @param tipoDocumento the tipoDocumento to set
	 */
	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	/**
	 * @return the genero
	 */
	public String getGenero() {
		return genero;
	}

	/**
	 * @param genero the genero to set
	 */
	public void setGenero(String genero) {
		this.genero = genero;
	}

	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}

	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	
	

}
