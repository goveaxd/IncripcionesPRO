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
import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.ModeloCargaAcademica;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods = (RequestMethod.POST))
public class ITLP_CargaAcademica {

	@Autowired
	DAO repositorio;
	
	@GetMapping("cargaAcademica/{Carrera}/{Grupo}/{Semestre}")
	public List<ModeloCargaAcademica> buscarAlumno(@PathVariable String Grupo,@PathVariable String Carrera, @PathVariable int Semestre) {
		return repositorio.buscarMateriasCarga(Carrera,Grupo,Semestre);
	}
}
