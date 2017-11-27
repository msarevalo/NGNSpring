package co.edu.uelbosque.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Padre_Estudiante")
public class Padre_Estudiante {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)	
	private long id;
	@OneToOne
	@JoinColumn(name="Id_estudiante")
	private Estudiante estudiante;
	@OneToOne
	@JoinColumn(name="Id_acudiente")
	private Acudiente acudiente;
}
