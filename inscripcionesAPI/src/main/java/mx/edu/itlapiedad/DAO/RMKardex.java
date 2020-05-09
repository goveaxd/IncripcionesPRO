package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;



import mx.edu.itlapiedad.models.Kardex;


public class RMKardex implements RowMapper<Kardex>{

	@Override
	public Kardex mapRow(ResultSet rs, int rowNum) throws SQLException {
		Kardex kardex = new Kardex();
		kardex.setCalificacion(rs.getInt("calificacion"));
		kardex.setNombre_materia(rs.getString("nombre_materia"));
		kardex.setCodigo_materia(rs.getString("codigo_materia"));
	
		return kardex;
	}
	

	
	
	

}
