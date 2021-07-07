package ar.edu.unlam.P1.pb2.proyecto;

public class JugadorNoEncontradoException extends Exception {
	
	public JugadorNoEncontradoException() {
		super("El jugador buscado no se encuentra");
	}

}
