package ar.edu.unlam.P1.pb2.proyecto;

public class Goles {

	private Integer numeroDePartido;
	private Integer numeroDeCamiseta;
	private String condicionEquipo;
	private Integer minuto;

	public Goles(Integer numeroDePartido, Integer numeroDeCamiseta, String condicionEquipo, Integer minuto) {
		super();
		this.numeroDePartido = numeroDePartido;
		this.numeroDeCamiseta = numeroDeCamiseta;
		this.condicionEquipo = condicionEquipo;
		this.minuto = minuto;
	}

	public Integer getNumeroDePartido() {
		return numeroDePartido;
	}

	public void setNumeroDePartido(Integer numeroDePartido) {
		this.numeroDePartido = numeroDePartido;
	}

	public Integer getNumeroDeCamiseta() {
		return numeroDeCamiseta;
	}

	public void setNumeroDeCamiseta(Integer numeroDeCamiseta) {
		this.numeroDeCamiseta = numeroDeCamiseta;
	}

	public String getCondicionEquipo() {
		return condicionEquipo;
	}

	public void setCondicionEquipo(String condicionEquipo) {
		this.condicionEquipo = condicionEquipo;
	}

	public Integer getMinuto() {
		return minuto;
	}

	public void setMinuto(Integer minuto) {
		this.minuto = minuto;
	}

}
