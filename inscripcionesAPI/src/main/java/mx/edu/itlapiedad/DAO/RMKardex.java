package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Kardex;

public class RMKardex implements RowMapper<Kardex> {

	@Override
	public Kardex mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kardex kardex= new Kardex();
		kardex.setIdkardex(rs.getInt("idkardex"));
		kardex.setMaterias_idmaterias(rs.getInt("materias_idmaterias"));
		kardex.setAlumnos_idAlumno(rs.getInt("alumnos_idAlumno"));
		return kardex;
	}

}
