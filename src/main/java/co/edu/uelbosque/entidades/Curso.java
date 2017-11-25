package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="curso")
public class Curso {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long idCurso;
	private String nombreCurso;
	/**
	 * 
	 */
	public Curso() {
	}
	/**
	 * @param idCurso
	 * @param nombreCurso
	 */
	public Curso(long idCurso, String nombreCurso) {
		this.idCurso = idCurso;
		this.nombreCurso = nombreCurso;
	}
	/**
	 * @return the idCurso
	 */
	public long getIdCurso() {
		return idCurso;
	}
	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(long idCurso) {
		this.idCurso = idCurso;
	}
	/**
	 * @return the nombreCurso
	 */
	public String getNombreCurso() {
		return nombreCurso;
	}
	/**
	 * @param nombreCurso the nombreCurso to set
	 */
	public void setNombreCurso(String nombreCurso) {
		this.nombreCurso = nombreCurso;
	}
	
	
}
