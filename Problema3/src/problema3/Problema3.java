/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema3;

import java.util.*;

/**
 *
 * @author kyleAnthony
 */
public class Problema3 {

    public static void main(String[] args) {
        int contador = 0;
        int aux = 0;
        int suma = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite tamaño del arreglo");
        int tm = sc.nextInt();
        System.out.println("Digite los valores del arreglo");
        int Array[] = new int[tm];
        int Array1[] = new int[tm];
        for (int i = 0; i < Array.length; i++) {
            Array[i] = sc.nextInt();
            Array1[i] = Array[i];
            for (int j = 0; j < Array.length; j++) {
                
                aux = Array1[i];
                System.out.println("el auxiliar es " + aux + " el array es " + Array[i]);
                
                if((aux==Array[i]))
                {
                   
                }else{
                    suma = Array[i];
                }
            }
        }
        
        System.out.println("El número " + " que no se repite es " + suma);

    }

}
