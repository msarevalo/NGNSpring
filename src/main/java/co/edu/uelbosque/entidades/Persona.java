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
@Table(name="personas")

public class Persona {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idPersona;
	
	private int documento;
	private String nombre;
	private String apellidos;
	private String correo;

	@Temporal(TemporalType.TIMESTAMP)
	private Date fecNac;
	
	public Persona () {}
	
	public Persona(int documento, String nombre, String apellidos, String correo, Date fecNac) {
		super();
		this.documento = documento;
		this.nombre = nombre;
		this.apellidos = apellidos;
		this.correo = correo;
		this.fecNac = fecNac;
	}
	
	public long getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}

	public int getDocumento() {
		return documento;
	}

	public void setDocumento(int documento) {
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

	
	

}
