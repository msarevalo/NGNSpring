package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Acudiente;


public interface AcudientePersistence extends JpaRepository<Acudiente, Long> {

}
