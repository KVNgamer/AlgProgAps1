/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author KEVIN
 */
public class ListaEncadeada<T> {

    private node<T> head;
    private node<T> tail;
	
    private static class node<T> {
	private T dado;
	private node<T> proximo;
	private node<T> anterior;
		
	public node(T dado, node<T> anterior, node<T> proximo) {
            this.dado = dado;
            this.proximo = proximo;
            this.anterior = anterior;
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
    }
    
    public static int Partition(int[] dado, int anterior, int proximo){

        int pivot = dado[anterior];

        while(true){

            while(dado[anterior] < pivot){
                anterior++;
            }
            while (dado[proximo] > pivot){
                proximo--;
            }
            if (anterior < proximo) {
                int temp = dado[proximo];
                dado[proximo] = dado[anterior];
                dado[anterior] = temp;
            }
            else {
                return proximo;
            }

        }

    }

    public static void QuickSort_Recursive(int[] arr, int anterior, int proximo){
        if(anterior < proximo){
           int pivot = Partition(arr, anterior, proximo);

           if(pivot > 1)
              QuickSort_Recursive(arr, anterior, pivot - 1);

           if(pivot + 1 < proximo)
              QuickSort_Recursive(arr, pivot + 1, proximo);
        }
    }    
}
