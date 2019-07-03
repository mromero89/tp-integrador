package isi.died.tp.dominio;

public class Insumo implements Comparable<Insumo> {
	protected Integer id;
	protected String descripcion;
	protected Unidad unidadDeMedida;
	protected Double costo;
	protected Integer stock;
	protected Double peso;
	protected Boolean esRefrigerado;
	
	public Insumo() {}
	
	public Insumo (Integer id, String d, Unidad u, Double c, Integer s, Double p, Boolean eR) {
		this.id = id;
		this.descripcion= d;
		this.unidadDeMedida = u;
		this.costo = c;
		this.stock = s;
		this.peso = p;
		this.esRefrigerado = eR;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Unidad getUnidadDeMedida() {
		return unidadDeMedida;
	}
	public void setUnidadDeMedida(Unidad unidadDeMedida) {
		this.unidadDeMedida = unidadDeMedida;
	}
	public Double getCosto() {
		return costo;
	}
	public void setCosto(Double costo) {
		this.costo = costo;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Double getPeso() {
		return peso;
	}
	public void setPeso(Double peso) {
		this.peso = peso;
	}
	public Boolean getEsRefrigerado() {
		return esRefrigerado;
	}
	public void setEsRefrigerado(Boolean esRefrigerado) {
		this.esRefrigerado = esRefrigerado;
	}
	
	
	 public int compareTo(Insumo i) {
		 return (int) this.getStock()-i.getStock();
	 }
	
}
