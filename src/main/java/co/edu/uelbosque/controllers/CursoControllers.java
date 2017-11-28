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

import co.edu.uelbosque.entidades.Curso;
import co.edu.uelbosque.persistencia.CursoPersistence;

@RequestMapping("/api")
@RestController
public class CursoControllers {

	@Autowired
	CursoPersistence cp;
	
	/** Crear nuevo curso
	 * */
	@PostMapping("/curso/add")
	public Curso add (@Valid @RequestBody Curso curso) {
		return cp.save(curso);
	}

	/** Obtener todas los cursos
	 * */
	@GetMapping("/curso/list")
	public List<Curso> obtenerTodos(){
		return cp.findAll();
	}
	
	/** Obtener curso por Id
	 * */
	@GetMapping("/curso/{id}")
	public ResponseEntity<Curso> getCursoById(@PathVariable(value = "id") Long id) {
	    Curso c = cp.findOne(id);
	    if(c == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(c);
	}
	
	/** Modificar curso
	 * */
	@PutMapping("/curso/{id}")
	public ResponseEntity<Curso> update(@PathVariable(value = "id") Long id, @Valid @RequestBody Curso cursoDetails) {
	    Curso c = cp.findOne(id);
	    if(c == null) {
	        return ResponseEntity.notFound().build();
	    }
	    c.setIdCurso(cursoDetails.getIdCurso());
	    c.setNombreCurso(cursoDetails.getNombreCurso());	    

	    Curso updated = cp.save(c);
	    return ResponseEntity.ok(updated);
	}
	
	/** Eliminar un curso
	 * */
	@DeleteMapping("/curso/{id}")
	public ResponseEntity<Curso> delete(@PathVariable(value = "id") Long id) {
	    Curso c = cp.findOne(id);
	    if(c == null) {
	        return ResponseEntity.notFound().build();
	    }

	    cp.delete(c);
	    return ResponseEntity.ok().build();
	}
}


