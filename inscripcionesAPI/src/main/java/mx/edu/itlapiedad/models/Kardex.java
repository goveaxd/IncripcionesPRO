package mx.edu.itlapiedad.models;


public class Kardex {
	int calificacion;
	String nombre_materia, codigo_materia;
	public Kardex() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Kardex(int calificacion, String nombre_materia, String codigo_materia) {
		super();
		this.calificacion = calificacion;
		this.nombre_materia = nombre_materia;
		this.codigo_materia = codigo_materia;
	}
	public int getCalificacion() {
		return calificacion;
	}
	public void setCalificacion(int calificacion) {
		this.calificacion = calificacion;
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
	
	
}
