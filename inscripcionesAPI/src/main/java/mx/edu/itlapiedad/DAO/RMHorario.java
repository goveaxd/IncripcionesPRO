package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Horario;
import mx.edu.itlapiedad.models.Kardex;

public class RMHorario implements RowMapper<Horario> {

	@Override
	public Horario mapRow(ResultSet rs, int rowNum) throws SQLException {
		Horario horario = new Horario();
		horario.setNombre_materia(rs.getString("nombre_materia"));
		horario.setHora(rs.getString("hora"));
		horario.setDia(rs.getString("dia"));
		return horario;
	}
	
	
	
	
}
