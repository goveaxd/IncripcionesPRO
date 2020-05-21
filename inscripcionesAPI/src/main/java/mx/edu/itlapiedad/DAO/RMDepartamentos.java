package mx.edu.itlapiedad.DAO;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Horario;
import mx.edu.itlapiedad.models.Departamentos;
public class RMDepartamentos implements RowMapper<Departamentos>{
	@Override
	public Departamentos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Departamentos Departamentos = new Departamentos();
		Departamentos.setIddepartamento(rs.getInt("iddepartamento"));
		Departamentos.setNombre(rs.getString("nombre"));
		
		return Departamentos;
	}

}
