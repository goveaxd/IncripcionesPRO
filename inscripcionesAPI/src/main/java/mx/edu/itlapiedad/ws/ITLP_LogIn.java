package mx.edu.itlapiedad.ws;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Alumnos;

@RestController
@RequestMapping("/tec")
public class ITLP_LogIn {
	@Autowired
	DAO repositorio;
	
	@GetMapping("sesion")
	public Alumnos recuperarSesion(@RequestBody Alumnos alumno) {
		return repositorio.sesion(alumno);
	}

}
