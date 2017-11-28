package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Docente;


public interface DocentePersistence extends JpaRepository<Docente, Long> {

}


