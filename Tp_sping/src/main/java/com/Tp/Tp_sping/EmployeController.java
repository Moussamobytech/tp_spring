package com.Tp.Tp_sping;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmployeController {
	
	@Autowired
	private EmploiyeRepo EmploiyeRepo;
	
	@PostMapping("/emploiye")
	employe newEmploiye(@RequestBody employe newEmploiye){
		
		return EmploiyeRepo.save(newEmploiye);
		
	}
	
	@GetMapping("/emploiyes")
	List<employe> getAllEmployes(){
		return EmploiyeRepo.findAll();
	}
	@PutMapping("/emploiyes/{id}")
	public employe updateEmploiye(@PathVariable Long id, @RequestBody employe updatedEmploye) {
	    employe existingEmploye = EmploiyeRepo.findById(id).orElse(null);
	    
	    if (existingEmploye != null) {
	        existingEmploye.setNom(updatedEmploye.getNom());
	        existingEmploye.setPrenom(updatedEmploye.getPrenom());
	        return EmploiyeRepo.save(existingEmploye);
	    } else {
	        return null;
	    }
	}
	@DeleteMapping("/emploiye/{id}")
	public void deleteEmploiye(@PathVariable Long id) {
	    EmploiyeRepo.deleteById(id);
	}


	
}