package isi.died.tp.estructuras;

import static org.junit.Assert.*;

import org.junit.Test;

import isi.died.tp.dominio.Liquido;

public class LiquidoTest {

	@Test
	public void testCalcPesoPostivo() {
		
		Liquido l = new Liquido();
		l.setDensidad(1141.0);
		l.setVolumen(1.0);
		//Double peso = l.calcPeso();
		Double peso = l.calcPeso();
		Double pesoEsperado = 1141.0;
		assertEquals(pesoEsperado, peso);
		
		l.setDensidad(-12.0);
		assertEquals(pesoEsperado, peso);
	}
	
	@Test (expected = RuntimeException.class)
	public void testCalcPesoNegativo() {
		
		Liquido l = new Liquido();
		l.setDensidad(-1141.0);
		l.setVolumen(1.0);
		l.calcPeso();
		
		
		
	}

}
