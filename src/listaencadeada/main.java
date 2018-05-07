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
public class main {
     public static void main(String[] args) {

        int[] dado = { 6,3,4,8,9,2,1,5,7 };
        int max = 9;
        System.out.println("QuickSort By Recursive Method");

        ListaEncadeada.QuickSort_Recursive(dado, 0, max - 1);
            for (int i = 0; i < max; i++){
                System.out.print(dado[i]);
                if(i!=max-1)
                System.out.print(" - ");
            }
                System.out.println();
    }
}
