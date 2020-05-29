package mx.edu.itlapiedad.models;

public class AlumnoSemestre {
	String nombre, apellidos, NoControl, NombreCarrera, Numero_Semestre;

	public AlumnoSemestre() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AlumnoSemestre(String nombre, String apellidos, String noControl, String nombreCarrera,
			String numero_Semestre) {
		super();
		this.nombre = nombre;
		this.apellidos = apellidos;
		NoControl = noControl;
		NombreCarrera = nombreCarrera;
		Numero_Semestre = numero_Semestre;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}

	public String getNoControl() {
		return NoControl;
	}

	public void setNoControl(String noControl) {
		NoControl = noControl;
	}

	public String getNombreCarrera() {
		return NombreCarrera;
	}

	public void setNombreCarrera(String nombreCarrera) {
		NombreCarrera = nombreCarrera;
	}

	public String getNumero_Semestre() {
		return Numero_Semestre;
	}

	public void setNumero_Semestre(String numero_Semestre) {
		Numero_Semestre = numero_Semestre;
	}
	
	

	
}
	

	