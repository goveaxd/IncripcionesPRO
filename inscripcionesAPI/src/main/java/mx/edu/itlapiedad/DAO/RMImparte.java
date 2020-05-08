package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Imparte;

public class RMImparte  implements RowMapper<Imparte>{

	@Override
	public Imparte mapRow(ResultSet rs, int rowNum) throws SQLException {
		Imparte imparte = new Imparte();
		imparte.setCreditos(rs.getInt("creditos"));
		imparte.setCodigo_materia(rs.getString("codigo_materia"));
		imparte.setNombre_materia(rs.getString("nombre_materia"));
		imparte.setNombre(rs.getString("nombre"));
		imparte.setApellido(rs.getString("apellido"));
		return imparte;
	}

}
