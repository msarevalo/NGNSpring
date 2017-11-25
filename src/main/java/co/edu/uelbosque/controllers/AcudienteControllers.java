package co.edu.uelbosque.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uelbosque.entidades.Acudiente;
import co.edu.uelbosque.persistencia.AcudientePersistence;

@RequestMapping("/api")
@RestController
public class AcudienteControllers {

	@Autowired
	AcudientePersistence ap;
	
	/** Obtener acudiente
	 * */
	@GetMapping("/acudiente/datos")
	public List<Acudiente> obtenerTodos(){
		return ap.findAll();
	}
}
