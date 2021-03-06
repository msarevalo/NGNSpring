package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="curso_materia")
public class CursoMateria {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@JoinColumn(name="Id_curso")
	private Curso idCurso;
	@OneToOne
	@JoinColumn(name="Id_materia")
	private Materia idMateria;
	/**
	 * 
	 */
	public CursoMateria() {
	}
	/**
	 * @param id
	 * @param idCurso
	 * @param idMateria
	 */
	public CursoMateria(long id, Curso idCurso, Materia idMateria) {
		this.id = id;
		this.idCurso = idCurso;
		this.idMateria = idMateria;
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
	 * @return the idMateria
	 */
	public Materia getIdMateria() {
		return idMateria;
	}
	/**
	 * @param idMateria the idMateria to set
	 */
	public void setIdMateria(Materia idMateria) {
		this.idMateria = idMateria;
	}
	
	
}
