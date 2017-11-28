package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Usuarios;


public interface UsuariosPersistence extends JpaRepository<Usuarios, Long> {

}


