package isi.died.tp.estructuras;
import java.util.ArrayList;
import java.util.List;
import isi.died.tp.dominio.Planta;
import isi.died.tp.dominio.Insumo;

public class GrafoPlanta extends Grafo<Planta> {
	 public void imprimirDistanciaAdyacentes(Planta inicial) {
		 List<Planta> adyacentes = super.getAdyacentes(inicial);
		 for(Planta unAdyacente: adyacentes) {
		 Arista<Planta> camino = super.buscarArista(inicial, unAdyacente);
		 System.out.println("camino de "+inicial.getNombre()+" a "+
		 unAdyacente.getNombre()+ " tiene valor de "+ camino.getValor() );
		 }
		 }
	 
	 public Planta buscarPlanta(Planta inicial, Insumo i, Integer saltos) { 
		 ArrayList<Vertice<Planta>> plantasNsaltos = new ArrayList<>();
		 Vertice<Planta> v1 = new Vertice<Planta>(inicial);
		 for (Vertice v : vertices) {
			 if (this.existeCamino(v1, v, saltos))
				 plantasNsaltos.add(v);
		 }
		 
		 Vertice<Planta> p1 = new Vertice<Planta>();
		 for (Vertice<Planta> p : plantasNsaltos) {
			 if (p.getValor().necesitaInsumo(i))
				 p1 = p;
		 }
		 return p1.getValor();
	 }
	 
}
