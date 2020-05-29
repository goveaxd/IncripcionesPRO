package mx.edu.itlapiedad.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.AlumnoSemestre;

public class RMAlumnoSemestre implements RowMapper<AlumnoSemestre>{

	@Override
	public AlumnoSemestre mapRow(ResultSet rs, int rowNum) throws SQLException {
		AlumnoSemestre alumnoS = new AlumnoSemestre();
		
		alumnoS.setNombre(rs.getString("Nombre"));
		alumnoS.setApellidos(rs.getString("Apellidos"));
		alumnoS.setNoControl(rs.getString("NoControl"));
		alumnoS.setNumero_Semestre(rs.getString("Numero_Semestre"));
		alumnoS.setNombreCarrera(rs.getString("NombreCarrera"));
		
		
		return alumnoS;
	}

}
