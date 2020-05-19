package mx.edu.itlapiedad.ws;

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
import mx.edu.itlapiedad.models.SesionAlumno;

@RestController
@RequestMapping("/tec")
@CrossOrigin(origins = "*", methods={RequestMethod.GET})
public class ITLP_LogIn {
	@Autowired
	DAO repositorio;
	
	//SESION
	@GetMapping("sesion/{noControl}/{contraseña}")
	public String recuperarSesion(@PathVariable String noControl,@PathVariable String contraseña) {
		SesionAlumno alumno = new SesionAlumno();
		alumno.setContraseña(contraseña);
		alumno.setNoControl(noControl);
		try {
		Alumnos al=repositorio.sesion(alumno);
			return "Bienvenido "+al.getNombre()+" "+al.getApellidos();
		
		}catch(Exception d) {
		}
		return "Usuario y/o contraseña incorrectos";
	}

}
