/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package selectionsort;

import java.util.Scanner;

/**
 *
 * @author asus
 */
public class SelectionSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int size, i, j, temp;
        int arr[] = new int[50];
        Scanner scan = new Scanner(System.in);

        System.out.print("masukkan jumlah data : ");
        size = scan.nextInt();

        System.out.print("masukkan isi data : ");
        for (i = 0; i < size; i++) {
            arr[i] = scan.nextInt();
        }

        for (i = 0; i < size; i++) {
            for (j = i + 1; j < size; j++) {
                if (arr[i] > arr[j]) {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("hasil selection sort: ");
        for (i = 0; i < size; i++) {
            System.out.print(arr[i] + "  ");
        }

    }
}
