package usta.fis;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    int rows = 5, columns =4;
        Scanner keyboard = new Scanner(System.in);
        int [][] matrix = new int[rows][columns];

        // lectura de los elementos del arreglo
        System.out.println("Please type the values for the bidimensional array (matrix): ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print("This value will located in  Matrix["+i+"]"+ "["+j+"] =");
                matrix[i][j]=keyboard.nextInt();
            }
        }
        // mostrar datos en pantalla
        System.out.println("The introduced values are: ");
        for (int i = 0; i < rows ; i++) {
            for (int j = 0; j < columns ; j++) {
                System.out.print(" "+ matrix[i][j] + " ");
                if (matrix[i][j]< 10){
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
