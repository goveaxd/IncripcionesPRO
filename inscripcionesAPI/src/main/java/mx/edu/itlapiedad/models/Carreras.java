package mx.edu.itlapiedad.models;

public class Carreras {
	int idcarrera;
	String codigo;
	String nombre;
	int creditosTotales;
	
	public Carreras() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Carreras(int idcarrera, String codigo, String nombre, int creditosTotales) {
		super();
		this.idcarrera = idcarrera;
		this.codigo = codigo;
		this.nombre = nombre;
		this.creditosTotales = creditosTotales;
	}

	public int getIdcarrera() {
		return idcarrera;
	}

	public void setIdcarrera(int idcarrera) {
		this.idcarrera = idcarrera;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCreditosTotales() {
		return creditosTotales;
	}

	public void setCreditosTotales(int creditosTotales) {
		this.creditosTotales = creditosTotales;
	}

	
	
}
