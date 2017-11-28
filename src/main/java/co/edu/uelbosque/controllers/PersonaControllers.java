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

import co.edu.uelbosque.entidades.Persona;
import co.edu.uelbosque.persistencia.PersonaPersistence;

@RequestMapping("/api")
@RestController
public class PersonaControllers {
	
	@Autowired
	PersonaPersistence ap;
	
	/** Crear nueva persona
	 * */
	@PostMapping("/persona/add")
	public Persona addPersona (@Valid @RequestBody Persona persona) {
		return ap.save(persona);
	}

	/** Obtener todas las personas
	 * */
	@GetMapping("/persona/list")
	public List<Persona> obtenerTodos(){
		return ap.findAll();
	}
	@GetMapping("/persona/listar")
	 public List<Persona> findByApellidosOrderByNombresAsc(String apellidos) {
		return ap.findByApellidos(apellidos);
	}
	
	@GetMapping("/persona/apellidos")
	public List<Persona> findByApellidos(String apellidos) {
		return ap.findByApellidos(apellidos);
	}
	
	/** Obtener persona por Id
	 * */
	@GetMapping("/persona/{id}")
	public ResponseEntity<Persona> getPersonaByDocumento(@PathVariable(value = "id") Long documento) {
	    Persona p = ap.findOne(documento);
	    if(p == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(p);
	}
	
	/** Modificar personas
	 * */
	@PutMapping("/persona/{id}")
	public ResponseEntity<Persona> updatePersona(@PathVariable(value = "id") Long documento, @Valid @RequestBody Persona personaDetails) {
	    Persona p = ap.findOne(documento);
	    if(p == null) {
	        return ResponseEntity.notFound().build();
	    }
	    
	    p.setDocumento(personaDetails.getDocumento());
	    p.setTipoDocumento(personaDetails.getTipoDocumento());
	    p.setNombre(personaDetails.getNombre());
	    p.setApellidos(personaDetails.getApellidos());
	    p.setGenero(personaDetails.getGenero());
	    p.setTelefono(personaDetails.getTelefono());
	    p.setDireccion(personaDetails.getDireccion());
	    p.setCorreo(personaDetails.getCorreo());
	    p.setFecNac(personaDetails.getFecNac());

	    Persona updatedPersona = ap.save(p);
	    return ResponseEntity.ok(updatedPersona);
	}
	
	/** Eliminar una persona
	 * */
	@DeleteMapping("/persona/{id}")
	public ResponseEntity<Persona> deletePersona(@PathVariable(value = "id") Long documento) {
	    Persona p = ap.findOne(documento);
	    if(p == null) {
	        return ResponseEntity.notFound().build();
	    }

	    ap.delete(p);
	    return ResponseEntity.ok().build();
	}
	
}
