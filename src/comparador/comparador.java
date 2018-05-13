/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparador;

import NovaLista.no;
import java.util.Comparator;
import listaencadeada.numero;
/**
 *
 * @author KEVIN
 */
public class comparador  implements Comparator<numero> {      
    @Override
    public int compare(numero o1, numero o2) {
       if( o1.getNumero()==o2.getNumero()) {
    	   return 0;
       }
       return -1;
}
      public int compare_test(no o1, no o2) {
       if( (int)o1.getDado()==(int)o2.getDado()) {
    	   return 0;
       }
       return -1;
}
    
    
}
