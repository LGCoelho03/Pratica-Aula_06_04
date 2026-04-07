package pratica02;

import java.util.Scanner;

public class Pratica02 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um valor referente a quantidade de elementos dos vetores X e Y: ");
        int n = scanner.nextInt();

        int[] x = new int[n];
        int[] y = new int[n];

        // Leitura do vetor X
        for (int contadorVetorX = 0; contadorVetorX < x.length; contadorVetorX++) {
            System.out.print("Informe o valor para o " + (contadorVetorX + 1) + "º elemento do vetor X: ");
            x[contadorVetorX] = scanner.nextInt();
        }

        // Leitura do vetor Y
        for (int contadorVetorY = 0; contadorVetorY < y.length; contadorVetorY++) {
            System.out.print("Informe o valor para o " + (contadorVetorY + 1) + "º elemento do vetor Y: ");
            y[contadorVetorY] = scanner.nextInt();
        }

        int[] z = new int[n * 2];
        int tamanhoVetorZ = 0;

        for (int i = 0; i < x.length; i++) {
            z[tamanhoVetorZ] = x[i];
            tamanhoVetorZ++;
        }

        // Adiciona Y sem repetir
        for (int i = 0; i < y.length; i++) {
            boolean repetido = false;

            for (int j = 0; j < tamanhoVetorZ; j++) {
                if (y[i] == z[j]) {
                    repetido = true;
                    break;
                }
            }

            if (!repetido) {
                z[tamanhoVetorZ] = y[i];
                tamanhoVetorZ++;
            }
        }

        System.out.println("\nVetor X criado:");
        for (int num : x) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor Y criado:");
        for (int num : y) {
            System.out.print(num + " ");
        }

        System.out.println("\nVetor Z (união de X e Y):");
        for (int i = 0; i < tamanhoVetorZ; i++) {
            System.out.print(z[i] + " ");
        }
    }
}