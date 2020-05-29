package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.DocentesDepartamento;

public class RMDocentesDepartamento implements RowMapper<DocentesDepartamento> {

	@Override
	public DocentesDepartamento mapRow(ResultSet rs, int rowNum) throws SQLException {

		DocentesDepartamento docenteDep = new DocentesDepartamento();
		docenteDep.setNombre(rs.getString("nombre"));
		docenteDep.setApellido(rs.getString("apellido"));
		docenteDep.setRFC(rs.getString("RFC"));
		docenteDep.setNombreDep(rs.getString("nombreDep"));
		return docenteDep;
	}

}
