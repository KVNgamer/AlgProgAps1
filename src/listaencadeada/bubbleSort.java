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
public class bubbleSort {

    static int[] bubble_Sort(int[] dado) {//metodo estavel;
        int[] vetor =dado;
        int aux;
        boolean controle;

        for(int i=0;i < vetor.length;i++){
            controle=true;
            for(int j=0;j < vetor.length - 1;j++){
                if(vetor[j]>vetor[j+1]){
                    aux=vetor[j];
                    vetor[j]=vetor[j+1];
                    vetor[j+1]=aux;
                    controle=false;
                }
            } 
            if(controle)
                break;
        }
        return vetor;
    
    
    
    }
    
}
