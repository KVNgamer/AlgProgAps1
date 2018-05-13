/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import NovaLista.ListaEncadeadaK;



/*
 *
 * @author KEVIN
 * 
 */

public class main {
    //static ListaEncadeada<numero> listaNumero = new ListaEncadeada<numero>();
    public static ListaEncadeadaK<numero> listaNumeroK = new ListaEncadeadaK<numero>();
    public static ListaEncadeadaK<numero> listaNumeroK2 = new ListaEncadeadaK<numero>();
     
    public static void main(String[] args) {        
        //Test_Quick();
        //Test_Bubble();
        testeListaK2();
        listaNumeroK2.mostraLista();
        listaNumeroK2=ListaEncadeadaK.bubble_sort(listaNumeroK2);
        listaNumeroK2.mostraLista();
        
        testeListaK();
        listaNumeroK.mostraLista();
        System.out.print("quick_sort");
        ListaEncadeadaK.quick_sort(listaNumeroK.getPrimeiro(), listaNumeroK.getFim());
        listaNumeroK.mostraLista();
  
    }
     
    public static void Test_Quick(){
        int[] dado = { 1,3,4,8,6,2,7,5,9 };
        int max = 9;
        
           for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
        System.out.println("\nQuickSort com VETOR");

        quicksort.QuickSort_Recursive(dado, 0, max-1);
        
        
            for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
                System.out.println("\n");
    }    
    
    public static void Test_Bubble(){
        int[] dado = { 1,3,4,8,6,2,7,5,9 };
        int max = 9;
        
           for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
        System.out.println("\nBubbleSort COM VETor");

        dado=bubbleSort.bubble_Sort(dado);
        
        
            for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
                System.out.println();
    }
     
    public ListaEncadeadaK getLista(){
        return this.listaNumeroK;
    }
    
    private static void testeListaK() {
        int[] dado = { 9,3,4,1,6,8,7,5,2 };  
        for(int i=0;i < dado.length;i++){                        
            listaNumeroK.addFim(dado[i]);            
        }              
    }
    
    private static void testeListaK2() {
        int[] dado = { 9,3,4,1,6,8,7,5,2 };  
        for(int i=0;i < dado.length;i++){                        
            listaNumeroK2.addFim(dado[i]);            
        }              
    }
    
}

