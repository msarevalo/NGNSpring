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
import co.edu.uelbosque.entidades.Administradores;
import co.edu.uelbosque.persistencia.AdministradoresPersistence;

@RequestMapping("/api")
@RestController
public class AdministradoresControllers {

	@Autowired
	AdministradoresPersistence ap;
	
	/** Crear nueva persona
	 * */
	@PostMapping("/admin/addUsu")
	public Administradores addUsuario (@Valid @RequestBody Administradores admin) {
		return ap.save(admin);
	}

	/** Obtener todas los usu
	 * */
	@GetMapping("/admin/list")
	public List<Administradores> obtenerTodos(){
		return ap.findAll();
	}
	
	/** Obtener us por Id
	 * */
	@GetMapping("/admin/{id}")
	public ResponseEntity<Administradores> getAdministradoresById(@PathVariable(value = "id") Long idAdmin) {
	    Administradores a = ap.findOne(idAdmin);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }
	    return ResponseEntity.ok().body(a);
	}
	
	/** Modificar us
	 * */
	@PutMapping("/admin/{id}")
	public ResponseEntity<Administradores> updateAdministradores(@PathVariable(value = "id") Long idAdmin, @Valid @RequestBody Administradores adminDetails) {
	    Administradores a = ap.findOne(idAdmin);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }
	    a.setDocumento(adminDetails.getDocumento());
	    a.setNombre(adminDetails.getNombre());
	    a.setApellidos(adminDetails.getApellidos());
	    a.setCredenciales(adminDetails.getCredenciales());
	    

	    Administradores updatedAdmin = ap.save(a);
	    return ResponseEntity.ok(updatedAdmin);
	}
	
	/** Eliminar una us
	 * */
	@DeleteMapping("/admin/{id}")
	public ResponseEntity<Administradores> deleteAdministraciones(@PathVariable(value = "id") Long idAdmin) {
	    Administradores a = ap.findOne(idAdmin);
	    if(a == null) {
	        return ResponseEntity.notFound().build();
	    }

	    ap.delete(a);
	    return ResponseEntity.ok().build();
	}
}
