package ar.edu.unlam.P1.pb2.proyecto;

public class Miembros {
	
	private Integer dni;
	private String nombre;
	private String equipo;

	public Miembros(Integer dni, String nombre, String equipo) {
		
		this.dni=dni;
		this.nombre=nombre;
		this.equipo=equipo;
		
	}

	public Integer getDni() {
		return dni;
	}

	public void setDni(Integer dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getEquipo() {
		return equipo;
	}

	public void setEquipo(String equipo) {
		this.equipo = equipo;
	}
	
	

}
