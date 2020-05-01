package mx.edu.itlapiedad.models;

public class Alumnos {
	int idAlumno;
	String Nombre;
	String Apellidos;
	String NoControl;
	String Correo;
	String Contraseña;
	public int getIdAlumno() {
		return idAlumno;
	}
	public void setIdAlumno(int idAlumno) {
		this.idAlumno = idAlumno;
	}
	public String getNombre() {
		return Nombre;
	}
	public void setNombre(String nombre) {
		Nombre = nombre;
	}
	public String getApellidos() {
		return Apellidos;
	}
	public void setApellidos(String apellidos) {
		Apellidos = apellidos;
	}
	public String getNoControl() {
		return NoControl;
	}
	public void setNoControl(String noControl) {
		NoControl = noControl;
	}
	public String getCorreo() {
		return Correo;
	}
	public void setCorreo(String correo) {
		Correo = correo;
	}
	public String getContraseña() {
		return Contraseña;
	}
	public void setContraseña(String contraseña) {
		Contraseña = contraseña;
	}
	public Alumnos(int idAlumno, String nombre, String apellidos, String noControl, String correo, String contraseña) {
		super();
		this.idAlumno = idAlumno;
		Nombre = nombre;
		Apellidos = apellidos;
		NoControl = noControl;
		Correo = correo;
		Contraseña = contraseña;
	}
	public Alumnos() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
