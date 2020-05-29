package mx.edu.itlapiedad.models;

public class Pago {
	int idpago;
	String estado;
	int semestre_idsemestre;
	int alumnos_idAlumno;
	String ticket;
	int noTransaccion;
	public Pago() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Pago(int idpago, String estado, int semestre_idsemestre, int alumnos_idAlumno, String ticket,
			int noTransaccion) {
		super();
		this.idpago = idpago;
		this.estado = estado;
		this.semestre_idsemestre = semestre_idsemestre;
		this.alumnos_idAlumno = alumnos_idAlumno;
		this.ticket = ticket;
		this.noTransaccion = noTransaccion;
	}
	public int getIdpago() {
		return idpago;
	}
	public void setIdpago(int idpago) {
		this.idpago = idpago;
	}
	public String getEstado() {
		return estado;
	}
	public void setEstado(String estado) {
		this.estado = estado;
	}
	public int getSemestre_idsemestre() {
		return semestre_idsemestre;
	}
	public void setSemestre_idsemestre(int semestre_idsemestre) {
		this.semestre_idsemestre = semestre_idsemestre;
	}
	public int getAlumnos_idAlumno() {
		return alumnos_idAlumno;
	}
	public void setAlumnos_idAlumno(int alumnos_idAlumno) {
		this.alumnos_idAlumno = alumnos_idAlumno;
	}
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	public int getNoTransaccion() {
		return noTransaccion;
	}
	public void setNoTransaccion(int noTransaccion) {
		this.noTransaccion = noTransaccion;
	}
		
}
