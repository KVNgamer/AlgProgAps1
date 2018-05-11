/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import comparador.comparador;
import java.util.Comparator;

/**
 *
 * @author KEVIN
 */

public class ListaEncadeada<T> {  

       
    private node<T> head;
    private node<T> tail;
    private int tamanho =0;
    
    public int getTamanho(){
        return tamanho;
    }

    public numero getDado() {
        return getDado();
    }
	
    public static class node<T> {
	private T dado;
	private node<T> proximo;
	private node<T> anterior;
		
	public node(T dado, node<T> anterior, node<T> proximo) {
            this.dado = dado;
            this.proximo = proximo;
            this.anterior = anterior;
	} 
        
        public T getDado(){
            return this.dado;
        }        
        public void setDado(T dado) {
		this.dado = dado;
	}
	public node<T> getProximo() {
		return proximo;
	}
	public void setProximo(node<T> proximo) {
		this.proximo = proximo;
	}
	public node<T> getAnterior() {
		return anterior;
	}
	public void setAnterior(node<T> anterior) {
		this.anterior = anterior;
	}
	public String toString() {
		return "" + dado;
	}
    }
    
    public void append(T dado){
	node<T> novo = new node<>(dado, tail, null);
		
            if (tail != null) {
		tail.proximo = novo;
            }
            else {
		head = novo;
            }
		tail = novo;
                tamanho++;
    }
	
    public void addFirst(T dado){
	 node<T> novo = new node<>(dado, null, head);
	   head = novo;
		    
	    if(head != null){
               head.anterior = novo;
	    }
	    else {
	    	tail = novo;
	    }
            tamanho++;
    }
    
    public boolean isEmpty() {
		return head == null;
	}
    
    public T getFirst() {		
            return head.getDado();
	}
        
    public T getLast()  {		
            node<T> i = head;                
        while (i.proximo!= null) {                     
            i = i.proximo;            
        }
        return i.getDado();
    }
    
    public void mostraLista(){
	node<T> i = head;                
        while (i != null) {
            System.out.print(i.dado.toString()); 
            if(i!=tail){
            System.out.print(" - "); 
            }
            i = i.proximo;
            
        }
        System.out.println("");
    }     
 
    public static numero procuraAnterior(int busca){
        numero numero=new numero(busca);
        numero=main.listaNumero.searchAnt(numero, new comparador());       
        return numero;
    }
    
    public T searchAnt(T key, Comparator<T> cmp){
	node<T> i = head;
        while (i != null) {
				
            if (cmp.compare(key,i.getDado()) == 0){
		return i.getAnterior().getDado();
            }
				
            i = i.getProximo();
	}
	return null;
    } 

    public static numero procuraProximo(int busca){
        numero numero = new numero(busca);       
        numero=main.listaNumero.searchPro(numero, new comparador());
        return numero;
    }
    
    public T searchPro(T key, Comparator<T> cmp){
	node<T> i = head;
        while (i != null) {
				
            if (cmp.compare(key,i.getDado()) == 0){
		return i.getProximo().getDado();
            }
				
            i = i.getProximo();
	}
	return null;
    }
    
    
    public static void QuickSort_Recursivo_Encadeado(numero anterior, numero proximo){ 
       
        
        if(anterior.getNumero() < proximo.getNumero()){
             numero pivot = Partition_Enc(anterior, proximo);

            if(pivot.getNumero() > 1)
                QuickSort_Recursivo_Encadeado(anterior, procuraAnterior(pivot.getNumero()));

            if(pivot.getNumero()+1 < proximo.getNumero())
                QuickSort_Recursivo_Encadeado(procuraProximo(pivot.getNumero()), proximo);
        }
    }
     
    public static numero Partition_Enc(numero anterior, numero proximo){

        numero pivot = anterior;

        while(true){

            while(anterior.getNumero() < pivot.getNumero()){
                procuraProximo(anterior.getNumero());
            }
            while (proximo.getNumero() > pivot.getNumero()){
               procuraAnterior(proximo.getNumero());
            }
            if (anterior.getNumero() < proximo.getNumero()) {
                int temp = proximo.getNumero();
                proximo.setNumero(anterior.getNumero());
                anterior.setNumero(temp); 
            }
            else {
                return proximo;
            }    
        }
    }

}
