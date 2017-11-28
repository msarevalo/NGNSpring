package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Notas;


public interface NotasPersistence extends JpaRepository<Notas, Long> {

}

