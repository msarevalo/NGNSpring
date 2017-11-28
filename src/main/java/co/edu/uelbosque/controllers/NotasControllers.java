package co.edu.uelbosque.controllers;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import co.edu.uelbosque.entidades.Notas;
import co.edu.uelbosque.persistencia.NotasPersistence;

@RequestMapping("/api")
@RestController
public class NotasControllers {

	@Autowired
	NotasPersistence ap;
	
	/** Crear nueva nota
	 * */
	@PostMapping("/nota/add")
	public Notas add (@Valid @RequestBody Notas notas) {
		return ap.save(notas);
	}

	/** Obtener todas las notas
	 * */
	@GetMapping("/notas/list")
	public List<Notas> obtenerTodos(){
		return ap.findAll();
	}
	
	/** Obtener notas por Id
	 * */
	@GetMapping("/notas/{id}")
	public ResponseEntity<Notas> getNotasByDocuento(@PathVariable(value = "id") Long documento) {
	    Notas a = ap.findOne(documento);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(a);
	}
	
	/** Modificar notas
	 * */
	@PutMapping("/notas/{id}")
	public ResponseEntity<Notas> update(@PathVariable(value = "id") Long documento, @Valid @RequestBody Notas notasDetails) {
	    Notas a = ap.findOne(documento);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }
	    a.setPrimerPeriodo(notasDetails.getPrimerPeriodo());
	    a.setSegundoPeriodo(notasDetails.getSegundoPeriodo());
	    a.setTercerPeriodo(notasDetails.getTercerPeriodo());
	    a.setCuartoPeriodo(notasDetails.getCuartoPeriodo());

	    Notas update = ap.save(a);
	    return ResponseEntity.ok(update);
	}
	
	/** Eliminar una nota
	 * */
	@DeleteMapping("/nota/{id}")
	public ResponseEntity<Notas> delete(@PathVariable(value = "id") Long documento) {
	    Notas a = ap.findOne(documento);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }

	    ap.delete(a);
	    return ResponseEntity.ok().build();
	}
	
	
}
