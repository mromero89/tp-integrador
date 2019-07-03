package isi.died.tp.dominio;
//import java.util.Iterator;
//import java.util.List;

import isi.died.tp.estructuras.*;


public class PruebaArbolInsumo {

	public static void main(String[] args) {
		Insumo i1 = new Insumo(1, "Insumo 1", Unidad.KILO, 500.0, 3, 200.3, false);
		Insumo i2 = new Insumo(2, "Insumo 2", Unidad.KILO, 450.0, 30, 100.0, false);
		Insumo i3 = new Insumo(3, "Insumo 3", Unidad.PIEZA, 300.0, 1, 50.0, false);
		Insumo i4 = new Insumo(4, "Insumo 4", Unidad.GRAMO, 550.0, 2, 600.0, false);
		Insumo i5 = new Insumo(5, "Insumo 5", Unidad.METRO, 700.0, 6, 300.0, false);
		
		ArbolBinarioBusqueda<Insumo> arb = new ArbolBinarioBusqueda<Insumo>(i1);
		
		arb.agregar(i2);
		arb.agregar(i3);
		arb.agregar(i4);
		arb.agregar(i5);
		
		/*
		List<Insumo> lista = arb.rango(30, 30);
		Iterator<Insumo> it = lista.iterator();

		while (it.hasNext()) {
		    Insumo current = it.next();
		    System.out.println(current.getDescripcion());
		   
		}*/
	}

}
