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

import co.edu.uelbosque.entidades.Materia;
import co.edu.uelbosque.persistencia.MateriaPersistence;

@RequestMapping("/api")
@RestController
public class MateriaControllers {

	@Autowired
	MateriaPersistence mp;
	
	/** Crear nueva materia
	 * */
	@PostMapping("/materia/add")
	public Materia add (@Valid @RequestBody Materia materia) {
		return mp.save(materia);
	}

	/** Obtener todas las materias
	 * */
	@GetMapping("/materia/list")
	public List<Materia> obtenerTodos(){
		return mp.findAll();
	}
	
	/** Obtener materia por Id
	 * */
	@GetMapping("/materia/{id}")
	public ResponseEntity<Materia> getMateriaById(@PathVariable(value = "id") Long id) {
	    Materia m = mp.findOne(id);
	    if(m == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(m);
	}
	
	/** Modificar materia
	 * */
	@PutMapping("/materia/{id}")
	public ResponseEntity<Materia> updateMateria(@PathVariable(value = "id") Long id, @Valid @RequestBody Materia materiaDetails) {
	    Materia m = mp.findOne(id);
	    if(m == null) {
	        return ResponseEntity.notFound().build();
	    }
	    m.setIdMateria(materiaDetails.getIdMateria());
	    m.setNombreMateria(materiaDetails.getNombreMateria());
	    

	    Materia updatedMat = mp.save(m);
	    return ResponseEntity.ok(updatedMat);
	}
	
	/** Eliminar una materia
	 * */
	@DeleteMapping("/materia/{id}")
	public ResponseEntity<Materia> delete(@PathVariable(value = "id") Long id) {
	    Materia m = mp.findOne(id);
	    if(m == null) {
	        return ResponseEntity.notFound().build();
	    }

	    mp.delete(m);
	    return ResponseEntity.ok().build();
	}
}
