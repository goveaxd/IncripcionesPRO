package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Docente;

public class RM implements RowMapper<Docente>{

	@Override
	public Docente mapRow(ResultSet rs, int rowNum) throws SQLException {
		Docente docente= new Docente();
		docente.setIddocente(rs.getInt("iddocente"));
		docente.setNombre(rs.getString("nombre"));
		docente.setApellido(rs.getString("apellido"));
		docente.setRFC(rs.getString("RFC"));
		docente.setMail(rs.getString("mail"));
		return docente;
	}

}
