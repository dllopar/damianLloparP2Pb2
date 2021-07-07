package ar.edu.unlam.P1.pb2.proyecto;

public class Dt extends Miembros {

	private Integer edad;

	public Dt(Integer dni, String nombre, String equipo, Integer edad) {
		super(dni, nombre, equipo);
		this.edad = edad;
	}

	public Integer getEdad() {
		return edad;
	}

	public void setEdad(Integer edad) {
		this.edad = edad;
	}

}
