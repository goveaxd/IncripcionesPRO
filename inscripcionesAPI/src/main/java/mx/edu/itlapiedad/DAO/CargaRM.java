package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.ModeloCargaAcademica;


public class CargaRM implements RowMapper<ModeloCargaAcademica> {

	@Override
	public ModeloCargaAcademica mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		ModeloCargaAcademica carga = new ModeloCargaAcademica();
		carga.setCodigo_materia(rs.getString("codigo_materia"));
		carga.setCreditos(rs.getInt("creditos"));
		carga.setNombre_materia("nombre_materia");
		return carga;
	}

}
