package isi.died.tp.dominio;

public class Liquido extends Insumo {

	private Double volumen;
	private Double densidad;
	
	public Double getVolumen() {
		return volumen;
	}

	public void setVolumen(Double volumen) {
		this.volumen = volumen;
	}

	public Double getDensidad() {
		return densidad;
	}

	public void setDensidad(Double densidad) {
		this.densidad = densidad;
	}

	
	
	public Liquido() {
		unidadDeMedida = Unidad.M3;
		
	}
	
	public Double calcPeso() {
		if (volumen <= 0.0 || densidad <= 0.0) 
			throw new RuntimeException("La densidad y el volumen deben ser positivas");
		this.peso = volumen * densidad;
		return peso;
	}
}
