package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Estudiante;


public interface EstudiantePersistence extends JpaRepository<Estudiante, Long> {

}


