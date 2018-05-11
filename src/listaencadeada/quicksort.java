/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

import listaencadeada.ListaEncadeada.node;

/**
 *
 * @author KEVIN
 */
public class quicksort {
        
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
