package ar.edu.unlam.P1.pb2.proyecto;

public class Jugador extends Miembros {

	private Integer numeroCamiseta;
	private String posicion;

	public Jugador(Integer dni, String nombre, String equipo, Integer numeroCamiseta, String posicion) {
		super(dni, nombre, equipo);
		this.numeroCamiseta=numeroCamiseta;
		this.posicion=posicion;
	}

	public Integer getNumeroCamiseta() {
		return numeroCamiseta;
	}

	public void setNumeroCamiseta(Integer numeroCamiseta) {
		this.numeroCamiseta = numeroCamiseta;
	}

	public String getPosicion() {
		return posicion;
	}

	public void setPosicion(String posicion) {
		this.posicion = posicion;
	}
	
	

}
