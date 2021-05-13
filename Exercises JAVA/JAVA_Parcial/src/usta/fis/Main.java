package usta.fis;
/*
 *AUTHORS: Juan Pablo Orjuela
 *DATE: 2021-April-23
 *DESCRIPTION: First program in java with arrangements.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        p_show_info_program();
        float v_average = 0;
        int counter = 0;
        float p_total = 0;
        float v_percent = 0;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Please type the number of qualifications you wish to enter");
        int v_array_size = keyboard.nextInt();
        float[] p_notes = new float[v_array_size];


        for (counter = 0; counter < p_notes.length; counter++) {
            System.out.println("Please enter your qualification number " + (counter + 1));
            p_notes[counter] = keyboard.nextFloat();
            while (p_notes[counter] < 0 || p_notes[counter] > 5) {
                System.err.println("ERR:Invalid number entered, please enter a number between 0 and 5");
                System.out.println("Please enter again your qualification number " + (counter + 1));
                p_notes[counter] = keyboard.nextFloat();
            }
            p_total = (p_total + p_notes[counter]);
        }
//los valores almacenados en tu arreglo en las casillas 1,3,5,7,9 deben ser mostrados como 300

        v_average = p_total / v_array_size;
        System.out.println("---------------------");
        System.out.println("The average is: " + v_average + "");
        System.out.println("---------------------");
        v_percent = (float) (0.6 / (p_notes.length - 2));

        for (counter = 0; counter < p_notes.length; counter++) {

             if (counter == 0 || counter == 2 || counter == 4 || counter == 6 || counter == 8) {
               System.out.println("---------------------------------------------------------");
               System.out.println("el valor de esta casilla es: " + 300);
               System.out.println("---------------------------------------------------------");
             }
             else if(counter == 3 || counter == 5 || counter == 7 || counter >=9){
                 System.out.println("---------------------------------------------------------");
                 System.out.println("el valor de esta casilla es: " +p_notes[counter] );
                 System.out.println("---------------------------------------------------------");
             }
            else if (counter == 1) {
                System.out.println("---------------------------------------------------------");
                System.out.println("The value of the qualification number " + (counter + 1) + " is: " + (p_notes[counter]));
                System.out.println("The percent for this qualification is: " + 0.3 * 100 + " %");
                System.out.println("The percent of the qualification number" + (counter + 1) + " is: " + +(p_notes[counter] * 0.3));
                System.out.println("---------------------------------------------------------");
            }
        }
    }

    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║------------SOFTARRANGEMENTS VERSION 1.0------------------║");
        System.out.println("║--------------MAKER: Juan Pablo Orjuela ------------------║");
        System.out.println("║------DESCR: First program in java with arrangements.-----║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}