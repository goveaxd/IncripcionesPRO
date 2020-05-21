package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Carreras;
import mx.edu.itlapiedad.models.Departamentos;

@RestController
@RequestMapping("/tec")
public class ITLP_Departamentos {
	
	@Autowired
	DAO repositorio;
	
	//DEPARTAMENTOS
	@GetMapping("departamento")
	public List<Departamentos> consultarDepartamentos(){
		return repositorio.consultarDepartamentos();
	}

}
