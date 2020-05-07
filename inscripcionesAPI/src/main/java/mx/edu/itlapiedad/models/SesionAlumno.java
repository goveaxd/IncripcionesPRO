package mx.edu.itlapiedad.models;

public class SesionAlumno {
	String NoControl;
	String Contraseña;
	public String getNoControl() {
		return NoControl;
	}
	public void setNoControl(String noControl) {
		NoControl = noControl;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public SesionAlumno(String noControl, String contraseña) {
		super();
		NoControl = noControl;
		Contraseña = contraseña;
	}
	public SesionAlumno() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
