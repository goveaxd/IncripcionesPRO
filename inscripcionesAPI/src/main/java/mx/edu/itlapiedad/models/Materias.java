package mx.edu.itlapiedad.models;

public class Materias {
	int idmaterias, creditos;
	String nombre_materia, codigo_materia, idcarrera;
	public Materias(int idmaterias, int creditos, String nombre_materia, String codigo_materia, String idcarrera) {
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
	public String getCarrera() {
		return idcarrera;
	}
	public void setCarrera(String idcarrera) {
		this.idcarrera = idcarrera;
	}
	
	
}
