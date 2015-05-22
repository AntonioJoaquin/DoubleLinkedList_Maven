package pkgTest; 
import static org.junit.Assert.assertEquals;

import org.junit.Test;

import pkgLista.DNode;
import pkgLista.Lista;



public class ListaTest {
    
    @Test
    public void Crearlista(){
    	Lista lista = new  Lista();
    	DNode primero =lista.getFirst();
    	DNode ultimo = lista.getLast();
    	DNode esperado = null;
    	assertEquals(primero,esperado);
    	assertEquals(ultimo,esperado);
    }
    
    @Test
    public void insertarDosAlppioYborrarPrimeroDeLista(){
    	Lista lista = new Lista();
    	DNode nodo = new DNode(2);
    	lista.insertBeginning(nodo);
    	DNode nodo1 = new DNode(1);
    	lista.insertBeginning(nodo1);
    	lista.remove(nodo1);
    	assertEquals(lista.getLast(),nodo);
    	assertEquals(lista.getFirst(),nodo);
    
    }
    @Test
    public void insertarDosYBorrarUltimo(){
    	Lista lista = new Lista();
    	DNode nodo = new DNode(2);
    	lista.insertBeginning(nodo);
    	DNode nodo1 = new DNode(1);
    	lista.insertBeginning(nodo1);
    	lista.remove(nodo);
    	assertEquals(lista.getLast(),nodo1);
    	assertEquals(lista.getFirst(),nodo1);
    }
    @Test
    public void insertarDosAlfinal(){
    	Lista lista = new Lista();
    	DNode node = new DNode(1);
    	lista.insertEnd(node);
    	DNode node2 = new DNode(2);
    	lista.insertEnd(node2);
    	assertEquals(lista.getLast(),node2);
    	assertEquals(lista.getFirst(),node);
    	
    }
    @Test
    public void insertarTresYBorrarDeEnMedio(){
    	Lista lista = new Lista();
    	DNode nodo = new DNode(3);
    	lista.insertBeginning(nodo);
    	DNode nodo1 = new DNode(2);
    	
    	lista.insertBeginning(nodo1);
    	DNode nodo2 = new DNode(1);
    	lista.insertBeginning(nodo2);
    	lista.remove(nodo1);
    	assertEquals(lista.getFirst(),nodo2);
    	assertEquals(lista.getLast(),nodo);
    }
    
    @Test
    public void insertarDespuesDeUno(){
    	Lista lista = new Lista();
    	DNode node2 = new DNode(2);
    	lista.insertBeginning(node2);
    	DNode node3 = new DNode(4);
    	lista.insertEnd(node3);
    	DNode node = new DNode(3);
    	lista.insertAfter(node2, node);
    	assertEquals(node,lista.getFirst().getNext());
    	assertEquals(node,lista.getLast().getPrevious());
    }
    @Test
    public void insertarAntesDeUno(){
    	Lista lista = new Lista();
    	DNode node2 = new DNode(2);
    	lista.insertBeginning(node2);
    	DNode node3 = new DNode(4);
    	lista.insertEnd(node3);
    	DNode node = new DNode(3);
    	lista.insertBefore(node3, node);
    	assertEquals(node,lista.getLast().getPrevious());
    	assertEquals(node,lista.getFirst().getNext());
    	
    }
    @Test
    public void insertaTresYBorraEnMedio(){
    	Lista lista = new Lista();
    	DNode n = new DNode(1);
    	lista.insertBeginning(n);
    	DNode n1 = new DNode(0);
    	lista.insertBeginning(n1);
    	DNode n2 = new DNode(2);
    	lista.insertBeginning(n2);
    	lista.remove(n);
    	assertEquals(lista.last,n2);
    	


    }
    @Test
    public void CrearNodoConprevious(){
    	DNode n = new DNode(0);
    	DNode n2 = new DNode(2);
    	DNode n1 = new DNode(1,n,n2);
    	Lista lista = new Lista();
    	lista.insertBeginning(n);
    	
    	assertEquals(lista.getLast(),n);  
    	}

@Test
public void removea(){
	Lista lista = new Lista();
	DNode n = new DNode(0);
	lista.insertBeginning(n);
	DNode n1 = new DNode(1);
	DNode n2 = new DNode(2);
	lista.insertEnd(n1);
	lista.insertEnd(n2);
	DNode n3 = new DNode(3);
	lista.insertEnd(n3);
	DNode n4 = new DNode(4);
	lista.insertEnd(n4);
	DNode n5 = new DNode(5);
	lista.insertEnd(n5);
	lista.remove(n2);
	assertEquals(n, lista.getFirst());
}	
}
