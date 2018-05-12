/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;



/*
 *
 * @author KEVIN
 * 
 */

public class main {
    static ListaEncadeada<numero> listaNumero = new ListaEncadeada<numero>();
     
    
    public static void main(String[] args) {
        //lokurada1();
        testeLista();
        listaNumero.mostraLista(); 
        listaNumero.QuickSort_Recursivo_Encadeado_test(listaNumero.getHead(),listaNumero.getTail());
        //QuickSorQuickSort_Recursivo_Encadeado_testt_Recursivo_Encadeado(listaNumero.getFirst(),listaNumero.getLast());
        listaNumero.mostraLista();
        
        
    }
     
    public static void lokurada1(){
        int[] dado = { 1,3,4,8,6,2,7,5,9 };
        int max = 9;
        
           for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
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
        int[] dado = { 8,3,4,9,6,2,7,5,1 };        
        for(int i=0;i < dado.length;i++){
            numero numero =new numero(dado[i]);            
            listaNumero.append(numero);            
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

