package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Curso;

public interface CursoPersistence extends JpaRepository<Curso, Long> {

}
