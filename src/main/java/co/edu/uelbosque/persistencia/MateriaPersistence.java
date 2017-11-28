package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Materia;

public interface MateriaPersistence extends JpaRepository<Materia, Long>{

}
