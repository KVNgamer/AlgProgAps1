/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaencadeada;

/**
 *
 * @author senacrs
 */
public class numero {
    int numero;

    numero(int busca) {
        numero=busca;
    }
    
    public int getNumero(){
        return this.numero;
    }
    public void setNumero(int numero){
        this.numero=numero;
    }
    @Override
	public String toString() {
		return ""+ numero;
	}
}