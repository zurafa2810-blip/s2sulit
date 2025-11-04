/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projectsayay;
import java.util.Scanner;

/**
 *
 * @author hamasawojajar
 */
public class Projectsayay {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int b, k; // b = baris, k = kolom

        System.out.print("Masukkan jumlah baris: ");
        b = s.nextInt();
        System.out.print("Masukkan jumlah kolom: ");
        k = s.nextInt();

        int[][] A = new int[b][k];
        int[][] B = new int[b][k];
        int[][] C = new int[b][k];

        // Input matriks A
        System.out.println("\nMasukkan nilai matriks A:");
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < k; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = s.nextInt();
            }
        }

        // Input matriks B
        System.out.println("\nMasukkan nilai matriks B:");
        for (int x = 0; x < b; x++) {
            for (int y = 0; y < k; y++) {
                System.out.print("B[" + x + "][" + y + "] = ");
                B[x][y] = s.nextInt();
            }
        }

        // Proses penjumlahan
        for (int m = 0; m < b; m++) {
            for (int n = 0; n < k; n++) {
                C[m][n] = A[m][n] + B[m][n];
            }
        }

        // Tampilkan hasil
        System.out.println("\nHasil (A + B):");
        for (int p = 0; p < b; p++) {
            for (int q = 0; q < k; q++) {
                System.out.print(C[p][q] + "\t");
            }
            System.out.println();
        }
    }
}


