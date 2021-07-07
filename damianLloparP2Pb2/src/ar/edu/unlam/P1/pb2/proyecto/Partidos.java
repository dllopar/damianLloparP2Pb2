package ar.edu.unlam.P1.pb2.proyecto;

import java.util.ArrayList;
import java.util.TreeSet;

public class Partidos {

	private String nombreEquipoLocal;
	private String nombreEquipoVisitante;
	private Integer idPartido;
	private TreeSet<Jugador> nomina;
	private ArrayList<Goles>golesEnPartido;

	public Partidos(Integer idPartido, String nombreEquipoLocal, String nombreEquipoVisitante) {

		this.nombreEquipoLocal = nombreEquipoLocal;
		this.nombreEquipoVisitante = nombreEquipoVisitante;
		this.idPartido = idPartido;
		this.nomina = new TreeSet<>();
		golesEnPartido= new ArrayList<>();
	}
	
	public Boolean ingresarJugadoresALaNomina(Jugador jugadorAIngresar) {
		
		return nomina.add(jugadorAIngresar);
		
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
