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

import co.edu.uelbosque.entidades.Docente;
import co.edu.uelbosque.persistencia.DocentePersistence;

@RequestMapping("/api")
@RestController
public class DocenteControllers {

	@Autowired
	DocentePersistence dp;
	
	/** Crear nuevo doc
	 * */
	@PostMapping("/doc/add")
	public Docente addUsuario (@Valid @RequestBody Docente doc) {
		return dp.save(doc);
	}

	/** Obtener todas los doc
	 * */
	@GetMapping("/doc/list")
	public List<Docente> obtenerTodos(){
		return dp.findAll();
	}
	
	/** Obtener doc por Id
	 * */
	@GetMapping("/doc/{id}")
	public ResponseEntity<Docente> getDocenteByDocuento(@PathVariable(value = "id") Long documento) {
	    Docente d = dp.findOne(documento);
	    if(d == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(d);
	}
	
	/** Modificar doc
	 * */
	@PutMapping("/doc/{id}")
	public ResponseEntity<Docente> update(@PathVariable(value = "id") Long documento, @Valid @RequestBody Docente docDetails) {
	    Docente d = dp.findOne(documento);
	    if(d == null) {
	        return ResponseEntity.notFound().build();
	    }
	    d.setDocumento(docDetails.getDocumento());
	    d.setNombre(docDetails.getNombre());
	    d.setApellidos(docDetails.getApellidos());
	    d.setEdad(docDetails.getEdad());
	    d.setFecNac(docDetails.getFecNac());

	    Docente update = dp.save(d);
	    return ResponseEntity.ok(update);
	}
	
	/** Eliminar un docente
	 * */
	@DeleteMapping("/doc/{id}")
	public ResponseEntity<Docente> delete(@PathVariable(value = "id") Long documento) {
	    Docente d = dp.findOne(documento);
	    if(d == null) {
	        return ResponseEntity.notFound().build();
	    }

	    dp.delete(d);
	    return ResponseEntity.ok().build();
	}
	
	
}