package mx.edu.itlapiedad.models;

public class Materias {
	int idmaterias, creditos, idcarrera;
	String nombre_materia, codigo_materia;
	public Materias(int idmaterias, int creditos, String nombre_materia, String codigo_materia, int idcarrera) {
		super();
		this.idmaterias = idmaterias;
		this.creditos = creditos;
		this.nombre_materia = nombre_materia;
		this.codigo_materia = codigo_materia;
		this.idcarrera = idcarrera;
	}
	public Materias() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getIdmaterias() {
		return idmaterias;
	}
	public void setIdmaterias(int idmaterias) {
		this.idmaterias = idmaterias;
	}
	public int getCreditos() {
		return creditos;
	}
	public void setCreditos(int creditos) {
		this.creditos = creditos;
	}
	public String getNombre_materia() {
		return nombre_materia;
	}
	public void setNombre_materia(String nombre_materia) {
		this.nombre_materia = nombre_materia;
	}
	public String getCodigo_materia() {
		return codigo_materia;
	}
	public void setCodigo_materia(String codigo_materia) {
		this.codigo_materia = codigo_materia;
	}
	public int getCarrera() {
		return idcarrera;
	}
	public void setCarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}
	
	
}
