package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Alumnos;

@RestController
@RequestMapping("/tec")
public class ITLP_Alumno {
	@Autowired
	DAO repositorio;
	
	@GetMapping("alumno/{idAlumno}")
	public Alumnos buscarAlumno(@PathVariable int idAlumno) {
		return repositorio.buscarAlumno(idAlumno);
	}
	
	@GetMapping("alumnos/carreras/{idcarrera}")
	public List<Alumnos> buscarCarrerasAlumno(@PathVariable int idcarrera) {
		return repositorio.buscarAlumnCarrera(idcarrera);
	}
	
}
