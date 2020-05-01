package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.Carreras;

@RestController
@RequestMapping("/tec")
public class ITLP_Carrera {
	@Autowired
	DAO repositorio;
	
	@GetMapping("carreras")
	public List<Carreras> consultarCarreras(){
		return repositorio.consultarCarreras();
	}
	@GetMapping("carreras/{idcarrera}")
	public Carreras buscarCarreras(@PathVariable int idcarrera) {
		return repositorio.buscarCarreras(idcarrera);
	}
}
