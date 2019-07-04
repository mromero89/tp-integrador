package isi.died.tp.dominio;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Planta {
	private Integer id;
	private String nombre;
	private ArrayList<Stock> stock;
	
	public String getNombre() {
		return nombre;
	}
	
	public Double costoTotal() {
		
		Double costototal = stock.stream().collect(Collectors.summingDouble(Stock::getCostoTotal));
		return costototal;
		
	}
	
	public List<Stock> stockEntre(Integer s1, Integer s2) {
		
		
		List<Stock> lista = stock.stream().filter((sto) -> (sto.getCantidad()>=s1)).filter((sto) -> (sto.getCantidad()<=s2)).collect(Collectors.toList());
		
		return lista;
		
	}

	public Boolean necesitaInsumo(Insumo i) {
			
		Boolean resultado = stock.stream().filter((sto) -> (sto.getId()==i.getId())).anyMatch((str)-> (str.getPuntoPedido()>str.getCantidad()));
				
		 return resultado;
		 
	}
	
}
