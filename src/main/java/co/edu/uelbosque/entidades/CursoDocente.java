package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="curso_docente")
public class CursoDocente {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@JoinColumn(name="Id_curso")
	private Curso idCurso;
	@OneToOne
	@JoinColumn(name="Id_docente")
	private Docente idDocente;
	/**
	 * 
	 */
	public CursoDocente() {
	}
	/**
	 * @param id
	 * @param idCurso
	 * @param idDocente
	 */
	public CursoDocente(long id, Curso idCurso, Docente idDocente) {
		this.id = id;
		this.idCurso = idCurso;
		this.idDocente = idDocente;
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
	 * @return the idCurso
	 */
	public Curso getIdCurso() {
		return idCurso;
	}
	/**
	 * @param idCurso the idCurso to set
	 */
	public void setIdCurso(Curso idCurso) {
		this.idCurso = idCurso;
	}
	/**
	 * @return the idDocente
	 */
	public Docente getIdDocente() {
		return idDocente;
	}
	/**
	 * @param idDocente the idDocente to set
	 */
	public void setIdDocente(Docente idDocente) {
		this.idDocente = idDocente;
	}
	
	
}
