package isi.died.tp.dominio;

public class Stock {
	private Integer id;
	private Integer cantidad;
	private Integer puntoPedido;
	private Insumo insumo;
	
	public Double getCostoTotal() {
		return insumo.getCosto()*cantidad;
	}
	
	public Integer getCantidad() {
		return cantidad;
	}
	
	public Integer getPuntoPedido() {
		return puntoPedido;
	}
	
	public Integer getId() {
		return id;
	}
}
