package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.DAO.DAO;
import mx.edu.itlapiedad.models.InsertarCargaAcademica;
import mx.edu.itlapiedad.models.Pago;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods={RequestMethod.POST})
public class ITLP_Pago {
	@Autowired
	DAO repositorio;
	
	//RUTA DE GUARDAR PAGO
	@PostMapping("Pago")
	public void guardarpago(@RequestBody Pago pago) {
	repositorio.guardarpago(pago);
	}			
}
