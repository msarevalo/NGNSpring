package co.edu.uelbosque.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uelbosque.entidades.Acudiente;
import co.edu.uelbosque.persistencia.AcudientePersistence;

@RequestMapping("/api")
@RestController
public class AcudienteControllers {

	@Autowired
	AcudientePersistence ap;
	
	@PostMapping("/acudiente/add")
	public Acudiente addAcudiente (@Valid @RequestBody Acudiente acud) {
		return ap.save(acud);
	}
	
	/** Obtener acudiente
	 * */
	@GetMapping("/acudiente/datos")
	public List<Acudiente> obtenerTodos(){
		return ap.findAll();
	}
	
	@GetMapping("/acudiente/{id}")
	public ResponseEntity<Acudiente> getAcudienteById(@PathVariable(value = "id") Long idAcu) {
	    Acudiente a = ap.findOne(idAcu);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(a);
	}
}
