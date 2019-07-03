package isi.died.tp.estructuras;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import isi.died.tp.dominio.Insumo;
import isi.died.tp.dominio.Unidad;

public class ArbolBinarioBusqueda<E extends Comparable<E>> extends Arbol<E> {

	protected Arbol<E> izquierdo;
	protected Arbol<E> derecho;
	
	public ArbolBinarioBusqueda(){
		this.valor=null;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e){
		this.valor=e;
		this.izquierdo=new ArbolVacio<E>();
		this.derecho=new ArbolVacio<E>();
	}
	
	public ArbolBinarioBusqueda(E e,Arbol<E> i,Arbol<E> d){
		this.valor=e;
		this.izquierdo=i;
		this.derecho=d;
	}
	
	@Override
	public List<E> preOrden() {
		List<E> lista = new ArrayList<E>();
		lista.add(this.valor);
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> inOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.add(this.valor);
		lista.addAll(this.derecho.preOrden());
		return lista;
	}
	@Override
	public List<E> posOrden() {
		List<E> lista = new ArrayList<E>();
		lista.addAll(this.izquierdo.preOrden());
		lista.addAll(this.derecho.preOrden());
		lista.add(this.valor);
		return lista;

	}
	@Override
	public boolean esVacio() {
		return false;
	}
        
	@Override
	public E valor() {
		return this.valor;
	}
	
	@Override
	public Arbol<E> izquierdo() {
		return this.izquierdo;
	}
	
	@Override
	public Arbol<E> derecho() {
		return this.derecho;
	}


	@Override
	public void agregar(E a) {
		if(this.valor.compareTo(a)<1) {
			if (this.derecho.esVacio()) this.derecho = new ArbolBinarioBusqueda<E>(a);
			else this.derecho.agregar(a);
		}else {
			if (this.izquierdo.esVacio()) this.izquierdo= new ArbolBinarioBusqueda<E>(a);
			else this.izquierdo.agregar(a);
		}
	}
	
	@Override
	public boolean equals(Arbol<E> unArbol) {
		return this.valor.equals(unArbol.valor()) && this.izquierdo.equals(unArbol.izquierdo()) && this.derecho.equals(unArbol.derecho());
	}

	@Override
	public boolean contiene(E unValor) {
		// TODO 1.a
		if (this.valor == unValor)
			return true;
		else
			if (!this.izquierdo.esVacio()) izquierdo.contiene(unValor);
			if (!this.derecho.esVacio()) derecho.contiene(unValor);
		return false;
	}

	@Override
	public int profundidad() {
		int prof = 0;
		if (this.esVacio()) return 0;
		else {
			prof++;
			if (!izquierdo.esVacio())
				if (!derecho.esVacio())
					return prof + izquierdo.profundidad()+derecho.profundidad();
				else
					return prof+izquierdo.profundidad();
			
			if (!derecho.esVacio())
				return prof+derecho.profundidad();
			else
				return prof;
			
		}
		// TODO 1.b
	}

	@Override
	public int cuentaNodosDeNivel(int nivel) {
		// TODO 1.c
		
			return guia(this, 0, nivel);
		
		//return 0;
	}
	
	
	public int guia(Arbol<E> arb, int na, int niv) {
		if (na == niv)
			return 1;
		else {
			if (!izquierdo.esVacio())
				if(!derecho.esVacio()) {
					return guia(izquierdo, na+1, niv)+guia(derecho,na+1,niv);
				}
				else
					return guia(izquierdo, na+1, niv);
			else
				return guia(derecho, na+1, niv);
			
		}
		
	}

	@Override
	public boolean esCompleto() {
		// TODO 1.d
		boolean completo = true;
		int profundidad = this.profundidad();
		for(int i=0; i<profundidad-1;i++) {
			if (!(this.cuentaNodosDeNivel(i)==(int)Math.pow(2, i)))
				completo = false;
		}
		if (completo)
			completo = guia2(this, profundidad, 0);
		//return false;
		return completo;
	}
	
	boolean guia2(Arbol<E> arbol, int p, int a) {
		if (a == p-1)
			if(arbol.izquierdo().esVacio())
				return false;
			else {
				guia2(arbol.izquierdo(), p, a+1);
				guia2(arbol.derecho(),p,a+1);
			}
		return true;		
				
	}

	@Override
	public boolean esLleno() {
		// TODO 1.e
		boolean lleno = true;
		int profundidad = this.profundidad();
		for (int i=0; i<profundidad; i++) {
			if (!(this.cuentaNodosDeNivel(i)==(int)Math.pow(2, i)))
				lleno = false;
		}
		return lleno;
	}
	
	public List<E> rango(int inicio, int fin) {
		
		Insumo i1 = new Insumo(0, "000000", Unidad.KILO, 0.0, inicio, 0.0, false);
		Insumo i2 = new Insumo(1, "111111", Unidad.KILO, 0.0, fin, 0.0, false);
		
		List<E> lista = this.preOrden();
		Iterator<E> it = lista.iterator();

		while (it.hasNext()) {
		    E current = it.next();
		    if (current.compareTo((E) i1)<0 || current.compareTo((E) i2)>0) {
		        it.remove();
		    }
		}
		
		return lista;
	}

}
