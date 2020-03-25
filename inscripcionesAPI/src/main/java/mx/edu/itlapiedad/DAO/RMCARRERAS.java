package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;


import mx.edu.itlapiedad.models.Carreras;

public class RMCARRERAS implements RowMapper<Carreras>{
	@Override
	public Carreras mapRow(ResultSet rs, int rowNum) throws SQLException {
		Carreras carreras= new Carreras();
		carreras.setIdcarrera(rs.getInt("idcarrera"));
		carreras.setCodigo(rs.getString("codigo"));
		carreras.setNombre(rs.getString("nombre"));
		carreras.setCreditosTotales(rs.getInt("creditosTotales"));
		return carreras;
	}
}
