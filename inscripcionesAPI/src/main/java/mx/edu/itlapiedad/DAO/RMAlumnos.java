package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import mx.edu.itlapiedad.models.Alumnos;

public class RMAlumnos implements RowMapper<Alumnos>{

	@Override
	public Alumnos mapRow(ResultSet rs, int rowNum) throws SQLException {
		Alumnos al=new Alumnos();
		al.setIdAlumno(rs.getInt("idAlumno"));
		al.setApellidos(rs.getString("Apellidos"));
		al.setContraseña(rs.getString("Contraseña"));
		al.setCorreo(rs.getString("Correo"));
		al.setNoControl(rs.getString("NoControl"));
		al.setNombre(rs.getString("Nombre"));
		return al;
	}

}
