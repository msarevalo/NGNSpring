package co.edu.uelbosque.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;

import co.edu.uelbosque.entidades.Administradores;


public interface AdministradoresPersistence extends JpaRepository<Administradores, Long>{

}
