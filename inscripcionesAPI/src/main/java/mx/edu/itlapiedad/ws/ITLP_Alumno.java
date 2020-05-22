package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Alumnos;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods={RequestMethod.GET})
public class ITLP_Alumno {
	@Autowired
	DAO repositorio;
	
	//ALUMNO-ID
	@GetMapping("alumno/{idAlumno}")
	public Alumnos buscarAlumno(@PathVariable int idAlumno) {
		return repositorio.buscarAlumno(idAlumno);
	}
	
	//ALUMNOS DE LA CARRERA
	@GetMapping("alumnos/carreras/{idcarrera}")
	public List<Alumnos> buscarCarrerasAlumno(@PathVariable int idcarrera) {
		return repositorio.buscarAlumnCarrera(idcarrera);
	}
	
	@GetMapping("alumnos/info/{idAlumno}")
	public List<Alumnos> buscarInfoAlumno(@PathVariable int idAlumno) {
		return repositorio.buscarInfoAlumno(idAlumno);
	}
	@GetMapping("alumnos/info/Npcrtl/{NoControl}")
	public Alumnos buscarInfoNoControlAlumno(@PathVariable int NoControl) {
		return repositorio.buscarInfoNoControlAlumno(NoControl);
	}
}
