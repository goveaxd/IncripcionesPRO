package mx.edu.itlapiedad.models;

public class Horario {
 String nombre_materia, hora, dia;

public Horario() {
	super();
	// TODO Auto-generated constructor stub
}

public Horario(String nombre_materia, String hora, String dia) {
	super();
	this.nombre_materia = nombre_materia;
	this.hora = hora;
	this.dia = dia;
}

public String getNombre_materia() {
	return nombre_materia;
}

public void setNombre_materia(String nombre_materia) {
	this.nombre_materia = nombre_materia;
}

public String getHora() {
	return hora;
}

public void setHora(String hora) {
	this.hora = hora;
}

public String getDia() {
	return dia;
}

public void setDia(String dia) {
	this.dia = dia;
}
 
 
}
