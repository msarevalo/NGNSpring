package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="curso_estudiante")
public class CursoEstudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	@OneToOne
	@JoinColumn(name="Id_curso")
	private Curso idCurso;
	private int documento;
	/**
	 * 
	 */
	public CursoEstudiante() {
	}
	/**
	 * @param id
	 * @param idCurso
	 * @param documento
	 */
	public CursoEstudiante(long id, Curso idCurso, int documento) {
		this.id = id;
		this.idCurso = idCurso;
		this.documento = documento;
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
	
	
}
