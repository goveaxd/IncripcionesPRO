package mx.edu.itlapiedad.DAO;

import java.util.List;

import mx.edu.itlapiedad.models.Docentes;
import mx.edu.itlapiedad.models.Horario;
import mx.edu.itlapiedad.models.Imparte;
import mx.edu.itlapiedad.models.Kardex;
import mx.edu.itlapiedad.models.Materias;
import mx.edu.itlapiedad.models.SesionAlumno;
import mx.edu.itlapiedad.models.Alumnos;
import mx.edu.itlapiedad.models.Carreras;
public interface DAO {
//prueba
	List<Docentes> consultarDocentes();
	Docentes buscarDocente(int iddocente);
	List<Materias> horarioDocentesMaterias(int alumnos_idAlumno);
	List<Carreras> consultarCarreras();
	Carreras buscarCarreras(int idcarrera);
	Alumnos buscarAlumno(int idAlumno);
	Alumnos sesion(SesionAlumno alumno);
	Materias buscarMaterias(int idmaterias);
	List<Alumnos> buscarAlumnCarrera(int idcarrera);
	List<Materias> buscarMateriaCarrera(int idcarrera);
	List<Kardex> consultaKardexMateria(int idalumno);
	List<Alumnos> buscarInfoAlumno(int idAlumno);
	List<Imparte> consultaDocenteMateria(int idAlumno);
	List<Horario> consultaHorario(int idAlumno);
	
	
}
