package mx.edu.itlapiedad.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.DAO.RM;
import mx.edu.itlapiedad.DAO.RMCARRERAS;
import mx.edu.itlapiedad.models.Docentes;
import mx.edu.itlapiedad.models.Kardex;
import mx.edu.itlapiedad.models.Materias;
import mx.edu.itlapiedad.models.SesionAlumno;
import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.Carreras;;

@Repository
public class JDBC implements DAO {

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	@Override
	public List<Docentes> consultarDocentes() {
		sql = "SELECT * FROM docentes";
		return conexion.query(sql, new RM());
	}
	
	@Override
	public Docentes buscarDocente(int iddocente) {
		sql = "SELECT * FROM docentes WHERE iddocente = ?";
		return conexion.queryForObject(sql, new RM(), iddocente);
	}
	
	//CARRERAS
	@Override
	public List<Carreras> consultarCarreras() {
		sql = "SELECT * FROM carreras";
		return conexion.query(sql, new RMCARRERAS());
	}
	@Override
	public Carreras buscarCarreras(int idcarrera) {
		sql = "SELECT * FROM carreras WHERE idcarrera = ?";
		return conexion.queryForObject(sql, new RMCARRERAS(), idcarrera);
	}
	
	@Override
	public Materias buscarMaterias(int idmaterias) {
		sql = "SELECT * FROM materias WHERE idmaterias = ?";
		return conexion.queryForObject(sql, new RMMaterias(), idmaterias);
	}
	
	@Override
	public List<Materias> buscarMateriaCarrera(int  idcarrera) {
		sql ="SELECT * FROM Materias WHERE idcarrera =?";
		return conexion.query(sql,new RMMaterias(), idcarrera);
	}

	@Override
	public Alumnos buscarAlumno(int idAlumno) {
		// TODO Auto-generated method stub
		sql ="SELECT * FROM Alumnos WHERE idAlumno =?";
		return conexion.queryForObject(sql, new RMAlumnos(), idAlumno);
	}

	@Override
	public Alumnos sesion(SesionAlumno alumno) {
		sql ="SELECT * FROM Alumnos WHERE NoControl =? and Contraseña = ?";
		return conexion.queryForObject(sql, new RMAlumnos(), alumno.getNoControl(),alumno.getContraseña());
	}

	@Override
	public List<Alumnos> buscarAlumnCarrera(int idcarrera) {
		sql ="select * from alumnos where idCarrera =?";
		return conexion.query(sql,new RMAlumnos(), idcarrera);
	}
	
	@Override
	public List<Materias> consultaKardexMateria(int idalumno) {
		sql ="select m.idmaterias, m.creditos, m.idcarrera,  m.nombre_materia, m.codigo_materia, c.calificacion\r\n" + 
	            "from materias m\r\n" + 
	            "join cursada c on c.materias_idmaterias=m.idmaterias\r\n" + 
	            "join alumnos a on a.idalumno=c.alumnos_idAlumno\r\n" + 
	            "where a.idalumno=?";
		return conexion.query(sql,new RMMaterias(), idalumno);
	}

	//horarioDocentes
		@Override
		public List<Materias> horarioDocentesMaterias(int alumnos_idAlumno) {
			sql="select d.nombre, m.*, a.nombre\r\n" + 
					"from docentes d \r\n" + 
					"join imparte i on i.docentes_iddocente = d.iddocente\r\n" + 
					"join materias m on m.idmaterias = i.materias_idmaterias\r\n" + 
					"join horario h on h.materias_idmaterias = m.idmaterias\r\n" + 
					"join alumnos a on a.idalumno=h.alumnos_idAlumno\r\n" + 
					"where a.idAlumno = ?";
			return conexion.query(sql,new RMMaterias(), alumnos_idAlumno);
		}
}
