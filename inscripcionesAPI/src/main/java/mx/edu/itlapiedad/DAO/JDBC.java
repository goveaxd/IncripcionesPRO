package mx.edu.itlapiedad.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.DAO.RM;
import mx.edu.itlapiedad.DAO.RMCARRERAS;
import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Carreras;;

@Repository
public class JDBC implements DAO {

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	@Override
	public List<Docente> consultarDocentes() {
		sql = "SELECT * FROM docentes";
		return conexion.query(sql, new RM());
	}
	
	@Override
	public Docente buscarDocente(int iddocente) {
		sql = "SELECT * FROM docentes WHERE iddocente = ?";
		return conexion.queryForObject(sql, new RM(), iddocente);
	}
	
	//CARRERAS
	@Override
	public List<Carreras> consultarCarreras() {
		sql = "SELECT * FROM carreras";
		return conexion.query(sql, new RMCARRERAS());
	}
	@Override
	public Carreras buscarCarreras(int idcarrera) {
		sql = "SELECT * FROM carreras WHERE idcarrera = ?";
		return conexion.queryForObject(sql, new RMCARRERAS(), idcarrera);
	}
	
}
