package mx.edu.itlapiedad.models;

public class Imparte {
int creditos;
String codigo_materia, nombre_materia, nombre, apellido;
public Imparte() {
	super();
	// TODO Auto-generated constructor stub
}
public Imparte(int creditos, String codigo_materia, String nombre_materia, String nombre, String apellido) {
	super();
	this.creditos = creditos;
	this.codigo_materia = codigo_materia;
	this.nombre_materia = nombre_materia;
	this.nombre = nombre;
	this.apellido = apellido;
}
public int getCreditos() {
	return creditos;
}
public void setCreditos(int creditos) {
	this.creditos = creditos;
}
public String getCodigo_materia() {
	return codigo_materia;
}
public void setCodigo_materia(String codigo_materia) {
	this.codigo_materia = codigo_materia;
}
public String getNombre_materia() {
	return nombre_materia;
}
public void setNombre_materia(String nombre_materia) {
	this.nombre_materia = nombre_materia;
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


}
