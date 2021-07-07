package ar.edu.unlam.P1.pb2.Test;

import static org.junit.Assert.*;

import org.junit.Test;

import ar.edu.unlam.P1.pb2.proyecto.Dt;
import ar.edu.unlam.P1.pb2.proyecto.Goles;
import ar.edu.unlam.P1.pb2.proyecto.Jugador;
import ar.edu.unlam.P1.pb2.proyecto.Miembros;
import ar.edu.unlam.P1.pb2.proyecto.Partidos;
import ar.edu.unlam.P1.pb2.proyecto.Torneo;

public class TorneoTest {

	@Test
	public void testQueSePuedaIngresarMiemBrosAUnEquipo() {

		Torneo apertura = new Torneo();

		Miembros scaloni = new Dt(222333, "Scaloni", "Argentina", 42);
		Miembros messi = new Jugador(44455, "Messi", "argentina", 10, "del");

		apertura.ingresarMiembrosDeEquipo(scaloni);
		apertura.ingresarMiembrosDeEquipo(messi);

		Integer Esperado = 2;
		Integer actual = apertura.cantidadDeMiembros();

		assertEquals(Esperado, actual);

	}

	@Test
	public void testQuePermiteSaberSiGanoELLocal() {
		Torneo apertura = new Torneo();
		Goles gol1 = new Goles(1, 10, "local", 15);	
		Partidos argchi = new Partidos(1, "Argentina", "Chile", gol1);
			
		Miembros scaloni = new Dt(222333, "Scaloni", "Argentina", 42);
		Miembros messi = new Jugador(44455, "Messi", "argentina", 10, "del");
		Miembros otamendi = new Jugador(666655, "Otamendi", "argentina", 2, "def");
		
		Miembros lasarte = new Dt(1111, "Lasarte", "chile", 60);
		Miembros vidal = new Jugador(2222, "Vidal", "chile", 8, "vol");
		Miembros medel = new Jugador(555, "Medel", "chile", 14, "vol");
		
		apertura.ingresarMiembrosDeEquipo(scaloni);
		apertura.ingresarMiembrosDeEquipo(messi);
		apertura.ingresarMiembrosDeEquipo(otamendi);
		apertura.ingresarMiembrosDeEquipo(lasarte);
		apertura.ingresarMiembrosDeEquipo(vidal);
		apertura.ingresarMiembrosDeEquipo(medel);
		
		
	}

}
