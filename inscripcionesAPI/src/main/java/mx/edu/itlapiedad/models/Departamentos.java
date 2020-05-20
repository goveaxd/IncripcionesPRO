package mx.edu.itlapiedad.models;

public class Departamentos {
	int iddepartamento;
	String nombre;
	
	public Departamentos() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Departamentos(int iddepartamento, String nombre) {
		super();
		this.iddepartamento = iddepartamento;
		this.nombre = nombre;
	}

	public int getIddepartamento() {
		return iddepartamento;
	}

	public void setIddepartamento(int iddepartamento) {
		this.iddepartamento = iddepartamento;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	
}
