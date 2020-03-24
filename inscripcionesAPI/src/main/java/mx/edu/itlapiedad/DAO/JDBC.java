package mx.edu.itlapiedad.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.DAO.RM;
import mx.edu.itlapiedad.models.Docente;;

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
	
}
