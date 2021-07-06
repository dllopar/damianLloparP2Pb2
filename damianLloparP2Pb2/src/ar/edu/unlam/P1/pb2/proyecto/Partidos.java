package ar.edu.unlam.P1.pb2.proyecto;

import java.util.TreeSet;

public class Partidos {
	
	private String nombreEquipoLocal;
	private String nombreEquipoVisitante;
	private Integer idPartido;
	private TreeSet<Jugador>nomina;

	public Partidos(Integer idPartido, String nombreEquipoLocal, String nombreEquipoVisitante, TreeSet<Jugador> nomina) {
		
		this.nombreEquipoLocal=nombreEquipoLocal;
		this.nombreEquipoVisitante=nombreEquipoVisitante;
		this.idPartido=idPartido;
		this.nomina= new TreeSet<>();
	}

	public String getNombreEquipoLocal() {
		return nombreEquipoLocal;
	}

	public void setNombreEquipoLocal(String nombreEquipoLocal) {
		this.nombreEquipoLocal = nombreEquipoLocal;
	}

	public String getNombreEquipoVisitante() {
		return nombreEquipoVisitante;
	}

	public void setNombreEquipoVisitante(String nombreEquipoVisitante) {
		this.nombreEquipoVisitante = nombreEquipoVisitante;
	}

	public Integer getIdPartido() {
		return idPartido;
	}

	public void setIdPartido(Integer idPartido) {
		this.idPartido = idPartido;
	}

	public TreeSet<Jugador> getNomina() {
		return nomina;
	}

	public void setNomina(TreeSet<Jugador> nomina) {
		this.nomina = nomina;
	}
	
	

}
