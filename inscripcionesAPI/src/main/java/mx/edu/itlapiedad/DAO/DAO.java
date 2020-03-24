package mx.edu.itlapiedad.DAO;

import java.util.List;

import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Carreras;
public interface DAO {

	List<Docente> consultarDocentes();
	Docente buscarDocente(int iddocente);
	
	List<Carreras> consultarCarreras();
	Carreras buscarCarreras(int idcarrera);
}
