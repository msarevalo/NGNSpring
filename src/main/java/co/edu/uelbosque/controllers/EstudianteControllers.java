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

import co.edu.uelbosque.entidades.Estudiante;
import co.edu.uelbosque.persistencia.EstudiantePersistence;


@RequestMapping("/api")
@RestController
public class EstudianteControllers {

	@Autowired
	EstudiantePersistence ep;
	
	/** Crear nuevo estudiante
	 * */
	@PostMapping("/estudiante/add")
	public Estudiante add (@Valid @RequestBody Estudiante est) {
		return ep.save(est);
	}

	/** Obtener todas los est
	 * */
	@GetMapping("/estudiante/list")
	public List<Estudiante> obtenerTodos(){
		return ep.findAll();
	}
	
	/** Obtener est por Id
	 * */
	@GetMapping("/estudiante/{id}")
	public ResponseEntity<Estudiante> getEstudianteByDocumento(@PathVariable(value = "id") Long documento) {
	    Estudiante e = ep.findOne(documento);
	    if(e == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(e);
	}
	
	/** Modificar est
	 * */
	@PutMapping("/estudiante/{id}")
	public ResponseEntity<Estudiante> updateEstudiante(@PathVariable(value = "id") Long documento, @Valid @RequestBody Estudiante estDetails) {
	    Estudiante e = ep.findOne(documento);
	    if(e == null) {
	        return ResponseEntity.notFound().build();
	    }
	    e.setDocumento(estDetails.getDocumento());
	    e.setNombre(estDetails.getNombre());
	    e.setApellidos(estDetails.getApellidos());
	    e.setEdad(estDetails.getEdad());
	    e.setFecNac(estDetails.getFecNac());

	    Estudiante updated = ep.save(e);
	    return ResponseEntity.ok(updated);
	}
	
	/** Eliminar un estudiante
	 * */
	@DeleteMapping("/estudiante/{id}")
	public ResponseEntity<Estudiante> delete(@PathVariable(value = "id") Long documento) {
	    Estudiante a = ep.findOne(documento);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }

	    ep.delete(a);
	    return ResponseEntity.ok().build();
	}
	
	
}