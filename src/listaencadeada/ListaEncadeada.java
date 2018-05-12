/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import comparador.comparador;
import java.util.Comparator;
import listaencadeada.ListaEncadeada.node;
import static listaencadeada.main.listaNumero;

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

  
	
    public class node<T> {
	private T dado;
	private node<T> proximo;
	private node<T> anterior;
		
	public node(T dado, node<T> anterior, node<T> proximo) {
            this.dado = dado;
            this.proximo = proximo;
            this.anterior = anterior;
	} 

        private node(int busca) {
            this.dado = dado;
        }
        
        public T getDado(){
            return this.dado;
        }        
        public void setDado(T dado) {
		this.dado = dado;
	}
	public node<T> getProximo() {
		return this.proximo;
	}
	public void setProximo(node<T> proximo) {
		this.proximo = proximo;
	}
	public node<T> getAnterior() {
		return this.anterior;
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
    
    public node<T> getHead(){
        return head;
    }
    
    public node<T> getTail(){
        return tail;
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
        System.out.println("ENTRA_PROCURA_anterior "+busca);
        numero numero=new numero(busca);
        numero=main.listaNumero.searchAnt(numero, new comparador());       
        System.out.println("SAI_PROCURA_ANTERIRO  "+numero);
        return numero;  
    }

    public static numero procuraProximo(int busca){
        System.out.println("ENTRA_PROCURA_PROXIMO "+busca);
        numero numero = new numero(busca);       
        numero=main.listaNumero.searchPro(numero, new comparador());
        System.out.println("SAI_PROCURA_PROXIMO "+numero);
        return numero;
    }
    
     public T searchAnt(T key, Comparator<T> cmp){
        System.out.println("ENTRA_METODO_COMPARA_ANTERIOR "+key.toString());
	node<T> i = head;
        while (i != null) {
            int x = cmp.compare(key,i.proximo.getDado());            
            if (x == 0){		
                i=i.anterior;
                System.out.println("SAI_METODO_COMPARA_ANTERIOR "+i.toString());
                return i.getDado();                
            }				
            i = i.getProximo();
            System.out.println(i);
	}        
	return null;
    } 
     
    public T searchPro(T key, Comparator<T> cmp){
        System.out.println("ENTRA_METODO_COMPARA_PROXIMO "+key.toString());
	node<T> i = head; 
        /*node<T> u = head;
        while (i.proximo!= null) {                     
           i = i.proximo;            
        }*/
        while (i != null) {
            int x = cmp.compare(key,i.getDado());				
            if (x== 0){
                i=i.proximo;
                System.out.println("SAI_METODO_COMPARA_proximo "+i.toString());
		return i.getDado();
            }
            /*while (u.proximo != null) {                
                System.out.println(u+" teste");
                u=u.proximo; 
            }
            i=u;*/
            i = i.getProximo();
            System.out.println(i);
	}
        
	return null;
    }
    
    public  boolean verificaSeVemDepois(numero anterior, numero proximo) {
        //System.out.println("ENTRA_METODO_COMPARA_ANTERIOR "+anterior.toString());
	node<numero> i =listaNumero.head;
        Comparator<numero> cmp=new comparador();
        while (i != null) {
            int x = cmp.compare(proximo,i.proximo.getDado());
            
            if (x == 0){		
               // System.out.println("SAI_METODO_COMPARA_ANTERIOR "+i.toString());
                return true;                
            }				
            i = i.getProximo();
            //System.out.println(i);
	}        
	return false;
    } 
    
       
    public  void QuickSort_Recursivo_Encadeado(numero anterior, numero proximo){ 
       //System.out.println("A");
        
        if(verificaSeVemDepois(anterior,proximo)==true){
            //System.out.println("B");
            numero pivot = Partition_Enc(anterior, proximo);

            if(pivot.getNumero() >= 1){   
                //System.out.println("C");
                QuickSort_Recursivo_Encadeado(anterior, procuraAnterior(pivot.getNumero()));
            }
            if(pivot.getNumero()+1 <= proximo.getNumero()){ 
                //System.out.println("D");
                QuickSort_Recursivo_Encadeado(procuraProximo(pivot.getNumero()), proximo);
            }
        }
    }
     
    public  numero Partition_Enc(numero anterior, numero proximo){
        //System.out.println("E");
        int pivot = anterior.getNumero();

        while(true){
            //if(pivot==anterior.getNumero())
               // System.out.println("F - Pivot "+pivot+"- anterior "+anterior.getNumero()+"- proximo " +proximo.getNumero());
            
            
            while(anterior.getNumero() <= pivot){
                System.out.println("G - Pivot maior "+pivot+" que anterior "+anterior.getNumero());
                anterior=procuraProximo(anterior.getNumero());
            }
            while (proximo.getNumero() >= pivot){
                System.out.println("H - Pivot menor "+pivot+" que proximo "+proximo.getNumero());
                proximo=procuraAnterior(proximo.getNumero());
            }
            if (anterior.getNumero() < proximo.getNumero()) {
                System.out.println("I");
                int temp = proximo.getNumero();
                proximo.setNumero(anterior.getNumero());
                anterior.setNumero(temp); 
                listaNumero.mostraLista();
            }
            else {
                System.out.println("J");
                return proximo;
            }    
        }
    }
    
    public  boolean verificaSeVemDepois_test(node anterior, node proximo) {
        //System.out.println("ENTRA_METODO_COMPARA_ANTERIOR "+anterior.toString());
	node<numero> i =anterior;
        Comparator<numero> cmp=new comparador();
        numero numero=new numero();
        while (i != null) {
            numero.setNumero(Integer.parseInt(proximo.getDado().toString()));
            int x = cmp.compare( numero,i.proximo.getDado());            
            if (x == 0){		
               // System.out.println("SAI_METODO_COMPARA_ANTERIOR "+i.toString());
                return true;                
            }				
            i = i.getProximo();
            //System.out.println(i);
	}        
	return false;
    } 
    
    public  void QuickSort_Recursivo_Encadeado_test(node anterior, node proximo){ 
       System.out.println("A");
        
        if(verificaSeVemDepois_test(anterior,proximo)==true){
            System.out.println("B");
            int pivot = Partition_Enc_test(anterior, proximo);

            if(pivot > 1){   
                System.out.println("C");
                QuickSort_Recursivo_Encadeado_test(anterior, procuraAnterior_test(pivot));
            }
            if(pivot + 1 < (int) proximo.getDado()){ 
                System.out.println("D");
                QuickSort_Recursivo_Encadeado_test(procuraProximo_test(pivot), proximo);
            }
        }
    }
     
    public  int Partition_Enc_test(node anterior, node proximo){
        System.out.println(anterior.getDado());
        int pivot = Integer.parseInt(anterior.getDado().toString());
        while(true){              
            while(Integer.parseInt(anterior.getDado().toString()) < pivot){
                System.out.println("G - Pivot maior "+pivot+" que anterior "+anterior.getDado());
                anterior=procuraProximo_test(Integer.parseInt(anterior.getDado().toString()));
            }
            while (Integer.parseInt(proximo.getDado().toString())> pivot){
                System.out.println("H - Pivot menor "+pivot+" que proximo "+proximo.getDado());
                proximo=procuraAnterior_test(Integer.parseInt(proximo.getDado().toString()));
            }
            if (Integer.parseInt(anterior.getDado().toString())< Integer.parseInt(proximo.getDado().toString())) {
                System.out.println("I");
                int temp =Integer.parseInt(proximo.getDado().toString());
                proximo.setDado(anterior.getDado());
                anterior.setDado(temp); 
                listaNumero.mostraLista();
            }
            else {
                System.out.println("J");
                int i =Integer.parseInt(anterior.getDado().toString());
                return i;
            }    
        }
    }
    
     public  node procuraAnterior_test(int busca){
        System.out.println("ENTRA_PROCURA_anterior "+busca);
         node i = head;
         while (i != null) {
            //int x = cmp.compare((T) key.dado,i.proximo.dado);            
            //if (x == 0){	
            if(busca==Integer.parseInt(i.getDado().toString())){
                i=i.anterior;
                System.out.println("SAI_METODO_COMPARA_ANTERIOR ");
                return i;                
            }				
            i = i.getProximo();
            System.out.println(i);
	}         
              
        System.out.println("SAI_PROCURA_ANTERIRO  "+i.dado);
        return i;  
    }

    public node procuraProximo_test(int busca){
        System.out.println("ENTRA_PROCURA_PROXIMO "+busca);
        node node=new node(busca) ;
        node=main.listaNumero.searchPro_test(node, new comparador());
        System.out.println("SAI_PROCURA_PROXIMO "+node.dado);
        return node;
    }
    
     public node searchAnt_test(node key, Comparator<T> cmp){
        System.out.println("ENTRA_METODO_COMPARA_ANTERIOR "+key.getDado());
	node<T> i = head;
        while (i != null) {
            //int x = cmp.compare((T) key.dado,i.proximo.dado);            
            //if (x == 0){	
            if(Integer.parseInt(key.getDado().toString())==Integer.parseInt(i.getDado().toString())){
                i=i.anterior;
                System.out.println("SAI_METODO_COMPARA_ANTERIOR "+i.toString());
                return i;                
            }				
            i = i.getProximo();
            System.out.println(i);
	}        
	return null;
    } 
     
    public node searchPro_test(node key, Comparator<T> cmp){
        System.out.println("ENTRA_METODO_COMPARA_PROXIMO "+key.toString());
	node<T> i = head; 
        /*node<T> u = head;
        while (i.proximo!= null) {                     
           i = i.proximo;            
        }*/
        while (i != null) {
            int x = cmp.compare((T) key.dado,i.proximo.dado);				
            if (x== 0){
                i=i.proximo;
                System.out.println("SAI_METODO_COMPARA_proximo "+i.toString());
		return i;
            }
            /*while (u.proximo != null) {                
                System.out.println(u+" teste");
                u=u.proximo; 
            }
            i=u;*/
            i = i.getProximo();
            System.out.println(i);
	}
        
	return null;
    }
    
    

}
