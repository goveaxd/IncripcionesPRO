package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Kardex;
import mx.edu.itlapiedad.models.Materias;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods={RequestMethod.GET})
public class ITLP_Materia {
	@Autowired
	DAO repositorio;
	
	
	//MATERIAS
	@GetMapping("materias/{idmaterias}")
	public Materias buscarMaterias(@PathVariable int idmaterias) {
		return repositorio.buscarMaterias(idmaterias);
	}
	
	//MATERIAS POR EL ID DE LA CARRERA
	@GetMapping("materias/carrera/{idcarrera}") 
	public List<Materias> buscarMateriasCarrera(@PathVariable int idcarrera) {
		return repositorio.buscarMateriaCarrera(idcarrera);
	}
	
	
	//horarioc:
	@GetMapping("docente/materias/{alumnos_idAlumno}")
	public List<Materias> horarioDocentesMaterias(@PathVariable int alumnos_idAlumno){
		return repositorio.horarioDocentesMaterias(alumnos_idAlumno);
	}
	
}
