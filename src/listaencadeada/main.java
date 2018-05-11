/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import static listaencadeada.ListaEncadeada.QuickSort_Recursivo_Encadeado;

/*
 *
 * @author KEVIN
 * 
 */

public class main {
    static ListaEncadeada<numero> listaNumero = new ListaEncadeada<numero>();
     
    
    public static void main(String[] args) {
        testeLista();
        listaNumero.mostraLista(); 
        QuickSort_Recursivo_Encadeado(listaNumero.getFirst(),listaNumero.getLast());
        listaNumero.mostraLista(); 
        
    }
     
    public static void lokurada1(){
        int[] dado = { 6,3,4,8,9,2,1,5,7 };
        int max = 9;
        System.out.println("QuickSort");

        quicksort.QuickSort_Recursive(dado, 0, max-1);
        
        
            for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
                System.out.println();
    }     
     
    private static void testeLista() {
        int[] dado = { 6,3,4,8,9,2,1,5,7 };        
        for(int i=0;i < dado.length;i++){
            numero numero =new numero(dado[i]);            
            listaNumero.addFirst(numero);            
        }              
    }

    private static void quick() {
        System.out.println("QuickSort");
        ListaEncadeada.QuickSort_Recursivo_Encadeado(listaNumero.getFirst(),listaNumero.getLast());        
        listaNumero.mostraLista();
        System.out.println();
    }  
    public ListaEncadeada getLista(){
        return this.listaNumero;
    }
    
}

