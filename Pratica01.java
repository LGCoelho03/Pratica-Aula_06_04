/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pratica01;

import java.util.Scanner;

public class Pratica01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor referente a quantidade de elementos do vetor: ");
        int n = scanner.nextInt();
 
        int[] x = new int[n];

        for(int contador=0; contador < x.length; contador++){
            System.out.print("Informe o valor para o "+ (contador +1) + " º elemento do seu vetor:");
            x[contador] = scanner.nextInt();
        }

        System.out.println("Vetor X criado:");
        for (int numeros : x) {
        System.out.println(numeros + " ");
        }

        int[] y = new int[n];
        for(int i=0; i < x.length; i++){
            y[i] = x [x.length - 1 - i];
        }

        System.out.println("Vetor y (oposto ao X):");
        for (int numeros2 : y) {
            System.out.println(numeros2 + " ");
        }
    }
}
