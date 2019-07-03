package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Unidad;

public class ArbolBinarioBusquedaTest {

	@Test
	public void testContiene() {
		fail("Not yet implemented");
	}

	@Test
	public void testEqualsArbolOfE() {
		fail("Not yet implemented");
	}

	@Test
	public void testAgregar() {
		fail("Not yet implemented");
	}

	@Test
	public void testProfundidad() {
		fail("Not yet implemented");
	}

	@Test
	public void testCuentaNodosDeNivel() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsCompleto() {
		fail("Not yet implemented");
	}

	@Test
	public void testEsLleno() {
		fail("Not yet implemented");
	}
	
	@Test
	public void testRango() {
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
		
		List<Insumo> lista = arb.rango(30, 30);
		ArrayList<Insumo> lista2 = new ArrayList<Insumo>( );
		
		lista2.add(i2);
		
		assertEquals(lista, lista2);
		
		
	}
	
	@Test
	public void testRango2() {
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
		
		List<Insumo> lista = arb.rango(1, 2);
		ArrayList<Insumo> lista2 = new ArrayList<Insumo>( );
		
		lista2.add(i3);
		lista2.add(i4);
		
		assertEquals(lista, lista2);
		
		
	}

}
