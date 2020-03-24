package mx.edu.itlapiedad.DAO;

import java.util.List;

import mx.edu.itlapiedad.models.Docente;

public interface DAO {

	List<Docente> consultarDocentes();
	Docente buscarDocente(int iddocente);

}
