package mx.edu.itlapiedad.models;

public class DocentesDepartamento {
String nombre, apellido, RFC, nombreDep;

public DocentesDepartamento() {
	super();
	// TODO Auto-generated constructor stub
}



public DocentesDepartamento(String nombre, String apellido, String rFC, String nombreDep) {
	super();
	this.nombre = nombre;
	this.apellido = apellido;
	RFC = rFC;
	this.nombreDep = nombreDep;
}



public String getNombre() {
	return nombre;
}

public void setNombre(String nombre) {
	this.nombre = nombre;
}

public String getApellido() {
	return apellido;
}

public void setApellido(String apellido) {
	this.apellido = apellido;
}

public String getRFC() {
	return RFC;
}

public void setRFC(String rFC) {
	RFC = rFC;
}

public String getNombreDep() {
	return nombreDep;
}

public void setNombreDep(String nombreDep) {
	this.nombreDep = nombreDep;
}


}
