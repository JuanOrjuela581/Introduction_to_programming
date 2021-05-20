package usta.fis;
/*
AUTHOR: Juan Orjuela
DATE: 14/05/2021
DESCRIPTION: This is my first program using dialog windows.
 */

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int amount =0,operation=0;
        float result =0;
        int []array;

        // Se pide la cantidad de numeros al usuario
        JOptionPane.showMessageDialog(null,"CALCULATOR JOptionPane 1.0\nMAKER: Juan Pablo Orjuela\nDESCR: This software calculate 4 math operations");
        String answer = JOptionPane.showInputDialog("Hi, this program is a calculator,\nand it do an aritmethic operation, \nplease type the amount of numbers that you like use");
        amount= Integer.valueOf(answer);
        array = new int[amount];

        // Se solicita la operacion que deseea realizar
        answer = JOptionPane.showInputDialog("Please type: \n1 to sum\n2 to substract\n3 to multiply\n4 for divide\n0 to exit.");
        operation=Integer.valueOf(answer);
        if (operation ==0) {
            System.exit(0);
        }



        for (int i = 0; i < amount; i++) {
            answer=JOptionPane.showInputDialog("Please type the "+(i+1)+" Number");
            array[i]=Integer.valueOf(answer);
        }

        result = p_calculator(array,operation);

        JOptionPane.showMessageDialog(null,"Your result is: "+result);
    }

    // Metodo para calcular las operaciones
    public static float p_calculator (int []array,int operation){
        float result =0;
        int  mult=1, first_number = array[0];


        if (operation == 1){
            for (int i = 0; i < array.length; i++) {
                result = result +array[i];
            }
        }
        if (operation == 2){
            for (int i = 1; i < array.length;i++) {
                first_number= first_number - array[i];
                result= first_number;
            }
        }

        if (operation ==3){
            for (int i = 0; i < array.length; i++) {
                mult = array[i] * mult;
                result= mult;
            }
        }

        if (operation ==4) {
            for (int i = 1; i < array.length; i++) {
                first_number= first_number / array[i];
            }
        }

        return result;
    }
}

