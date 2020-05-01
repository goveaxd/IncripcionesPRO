package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Docentes;

@RestController
@RequestMapping("/tec")
public class ITLP_Docente {
	@Autowired
	DAO repositorio;
	
	@GetMapping("docente")
	public List<Docentes> consultarDocente(){
		return repositorio.consultarDocentes();
	}
	@GetMapping("docente/{iddocente}")
	public Docentes buscarDocente(@PathVariable int iddocente) {
		return repositorio.buscarDocente(iddocente);
	}
}
