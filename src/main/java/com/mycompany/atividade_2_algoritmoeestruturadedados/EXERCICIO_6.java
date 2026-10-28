
package com.mycompany.atividade_2_algoritmoeestruturadedados;

import java.util.Arrays;
import java.util.Random;

/**
 *
 * @author matheus
 */
public class EXERCICIO_6 {
   
 public static void main(String[] args) {
        Random random = new Random();
        int[] original = new int[30];

        
        for (int i = 0; i < original.length; i++) {
            original[i] = random.nextInt(31);
        }

     
        int[] ordenado = original.clone();

        
        for (int i = 0; i < ordenado.length - 1; i++) {
            for (int j = 0; j < ordenado.length - 1 - i; j++) {
                if (ordenado[j] < ordenado[j + 1]) {
                    int aux = ordenado[j];
                    ordenado[j] = ordenado[j + 1];
                    ordenado[j + 1] = aux;
                }
            }
        }

        System.out.println("Vetor original: " + Arrays.toString(original));
        System.out.println("Vetor ordenado: " + Arrays.toString(ordenado));
    }
}
