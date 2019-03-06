/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cod.lireriaio;


import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan Martínez
 */
public class IO {
    /**
     * Variable para consola
     */
    public final static int CONSOLA = 1;

    /**
     * Variable para ventana
     */
    public final static int VENTANA = 2;

    /**
     * Variable para int
     */
    public final static int INT = 3;

    /**
     *Método para introducir un número mediante teclado, int y se devuelva
     * @param windowConsola Parámetro para decir si queremos consola o ventana
     * @return devuelve el número int indicado
     */
    public static int introducirInt(int windowConsola) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        switch (windowConsola) {
            case CONSOLA:
                System.out.println("Introduzca número");
                numero = ler.nextInt();
                return numero;
            case VENTANA:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, "Introduzca número"));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     *Método para introducir un número int y una pregunta mediante teclado y se devuelva el int
     * @param windowCosola Parámetro para decir si queremos consola o ventana
     * @param mensaje Escribimos un String que se mostrará al pedir número
     * @return devuelve el número int indicado
     */
    public static int introducirInt(int windowCosola, String mensaje) {
        Scanner ler = new Scanner(System.in);
        int numero = 0;

        switch (windowCosola) {
            case CONSOLA:
                System.out.println(mensaje);
                numero = ler.nextInt();
                return numero;
            case VENTANA:
                numero = Integer.parseInt(JOptionPane.showInputDialog(null, mensaje));
                return numero;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
        return numero;
    }

    /**
     * Muestra en consola o ventana el número int almacenado en la variable.
     * @param numero Escribimos la variable donde se contiene el número int que
     * queremos que se muestre
     * @param windowConsola Parámetro para decir si queremos consola o ventana
     */
    public static void imprimir(int numero, int windowConsola) {

        switch (windowConsola) {
            case CONSOLA:
                System.out.println(numero);
                break;
            case VENTANA:
                JOptionPane.showMessageDialog(null, numero);
                break;
            default:
                JOptionPane.showMessageDialog(null,"Error. Elige CONSOLA o VENTANA");
        }
    }
}
