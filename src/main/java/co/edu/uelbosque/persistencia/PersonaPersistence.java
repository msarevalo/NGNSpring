package co.edu.uelbosque.persistencia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import co.edu.uelbosque.entidades.Persona;

@Repository
public interface PersonaPersistence extends JpaRepository<Persona, Long>{
	List<Persona> findByApellidos(String apellidos);
}
