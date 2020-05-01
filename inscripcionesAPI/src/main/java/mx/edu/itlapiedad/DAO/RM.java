package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import mx.edu.itlapiedad.models.Docentes;

public class RM implements RowMapper<Docentes>{

	@Override
	public Docentes mapRow(ResultSet rs, int rowNum) throws SQLException {
		Docentes docente= new Docentes();
		docente.setIddocente(rs.getInt("iddocente"));
		docente.setNombre(rs.getString("nombre"));
		docente.setApellido(rs.getString("apellido"));
		docente.setRFC(rs.getString("RFC"));
		docente.setMail(rs.getString("mail"));
		return docente;
	}
	
	
}
