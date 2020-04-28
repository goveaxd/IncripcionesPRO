package mx.edu.itlapiedad.DAO;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import mx.edu.itlapiedad.DAO.RM;
import mx.edu.itlapiedad.DAO.RMCARRERAS;
import mx.edu.itlapiedad.models.Docente;
import mx.edu.itlapiedad.models.Materias;
import mx.edu.itlapiedad.models.Alumno;
import mx.edu.itlapiedad.models.Carreras;;

@Repository
public class JDBC implements DAO {

	@Autowired
	JdbcTemplate conexion;
	
	String sql;
	@Override
	public List<Docente> consultarDocentes() {
		sql = "SELECT * FROM docentes";
		return conexion.query(sql, new RM());
	}
	
	@Override
	public Docente buscarDocente(int iddocente) {
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
	public List<Materias> buscarMateriaCarrera(String carrera) {
		sql ="SELECT * FROM Materias WHERE CARRERA =?";
		return conexion.query(sql,new RMMaterias(), carrera);
	}

	@Override
	public Alumno buscarAlumno(int idAlumno) {
		// TODO Auto-generated method stub
		sql ="SELECT * FROM Alumnos WHERE idAlumno =?";
		return conexion.queryForObject(sql, new RMAlumnos(), idAlumno);
	}

	@Override
	public Alumno sesion(Alumno alumno) {
		sql ="SELECT * FROM Alumnos WHERE NoControl =? and Contraseña = ?";
		return conexion.queryForObject(sql, new RMAlumnos(), alumno.getNoControl(),alumno.getContraseña());
	}

	@Override
	public List<Alumno> buscarAlumnCarrera(int idcarrera) {
		sql ="select * from alumnos where idCarrera =?";
		return conexion.query(sql,new RMAlumnos(), idcarrera);
	}
	
}
