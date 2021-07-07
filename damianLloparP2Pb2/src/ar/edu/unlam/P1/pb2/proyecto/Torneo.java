package ar.edu.unlam.P1.pb2.proyecto;

import java.util.ArrayList;

public class Torneo {

	private ArrayList<Goles> goles;
	private ArrayList<Partidos> partidos;
	private ArrayList<Miembros>miembrosEquipo;

	public Torneo() {

		goles = new ArrayList<>();
		partidos = new ArrayList<>();
		miembrosEquipo = new ArrayList<>();

	}
	
	public Boolean ingresarMiembrosDeEquipo(Miembros miembroAIngresar) {
		
		return miembrosEquipo.add(miembroAIngresar);
		
	}
	
	public Boolean registrarNuevoPartido(Partidos partidoNuevo) {
		
		return partidos.add(partidoNuevo);
		
	}
	
	public Boolean registrarGol(Goles golNuevo) {
		
		return goles.add(golNuevo);
	}
	
	/*public Boolean registrarNuevoGol(Goles golNuevo) {
		Boolean registrado = false;
		
		for (Goles goles2 : goles) {
			if(goles2.getNumeroDeCamiseta() == this.buscarJugador()) {
				
			}
		}
		
		return goles.add(golNuevo);
	}*/
	
	public Integer buscarJugador(Jugador buscado) throws JugadorNoEncontradoException {
		Integer aBuscar=0;

		for (Miembros jugador : miembrosEquipo) {
			if(jugador.getNombre().equalsIgnoreCase(buscado.getNombre())) {
				aBuscar=buscado.getNumeroCamiseta();
			}else {
				throw new JugadorNoEncontradoException();
			}
		}
		return aBuscar;
	}
	
	

	public ArrayList<Goles> getGoles() {
		return goles;
	}

	public ArrayList<Partidos> getPartidos() {
		return partidos;
	}

	public ArrayList<Miembros> getMiembrosEquipo() {
		return miembrosEquipo;
	}

	public Integer cantidadDeMiembros() {
		
		return miembrosEquipo.size();
	}
	
	

}
