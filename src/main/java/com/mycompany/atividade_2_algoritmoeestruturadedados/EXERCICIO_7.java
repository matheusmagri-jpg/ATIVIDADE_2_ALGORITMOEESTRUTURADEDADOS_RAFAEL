
package com.mycompany.atividade_2_algoritmoeestruturadedados;

import java.util.Scanner;

/**
 *
 * @author matheus
 */
public class EXERCICIO_7 { 
    
        public static void main(String[] args) {
     
        Scanner sc = new Scanner(System.in);
        int[] vetor = new int[10];

       
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("Digite o " + (i + 1) + "º número: ");
            vetor[i] = sc.nextInt();
        }

      
        for (int i = 0; i < vetor.length - 1; i++) {
            for (int j = 0; j < vetor.length - 1 - i; j++) {
                if (vetor[j] > vetor[j + 1]) {
                    int aux = vetor[j];
                    vetor[j] = vetor[j + 1];
                    vetor[j + 1] = aux;
                }
            }
        }

        System.out.print("Vetor ordenado: ");
        for (int n : vetor) {
            System.out.print(n + " ");
        }
        System.out.println();

        sc.close();
    }
}