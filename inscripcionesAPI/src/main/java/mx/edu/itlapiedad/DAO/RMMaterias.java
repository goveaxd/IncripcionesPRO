package mx.edu.itlapiedad.DAO;



import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;
import mx.edu.itlapiedad.models.Materias;

public class RMMaterias implements RowMapper<Materias>{
	
	
	@Override
	public Materias mapRow(ResultSet rs, int rowNum) throws SQLException {
		Materias materias= new Materias();
		materias.setIdmaterias(rs.getInt("idmaterias"));
		materias.setNombre_materia(rs.getString("nombre_materia"));
		materias.setCodigo_materia(rs.getString("codigo_materia"));
		materias.setCreditos(rs.getInt("creditos"));
		materias.setCarrera(rs.getString("carrera"));
		
		return materias;
	}
}
