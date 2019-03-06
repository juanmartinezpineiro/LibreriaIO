/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.lireriaio;

import static cod.lireriaio.IO.*;



/**
 *
 * @author Juan Martínez
 */
public class CodLireriaIO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {   
        int num = IO.introducirInt(IO.VENTANA);
        IO.imprimir(num, IO.CONSOLA);
       
    }
    
}
