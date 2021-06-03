package usta.fis;
/*
 *AUTHOR: Juan Pablo Orjuela
 *DATE: 2021-April-29
 *DESCRIPTION: Program with fibonacci series.
 */
import java.util.Scanner;
public class Main {
    public static void main(String[] args, int i) {
       p_show_info_program();
       int serie = 0;
       Scanner keyboard = new Scanner(System.in);
       System.out.println("Digit the number to the to the serie limit");
       serie = keyboard.nextInt();
       int array_fibo[] = new int[100];
       array_fibo = serie_fibonacci(serie,array_fibo);
       System.out.println("The fibonacci serie for the number "+serie+" is:");
       for (int i=0; array_fibo[i]!= 1;i++) {
           System.out.println(array_fibo[i] + ",");
        }
    }


    public static int[] serie_fibonacci(int limit, int[] array_fibo){
        array_fibo[0] = 0;
        array_fibo[1] = 1;
        for (int i= 1; array_fibo[i-1]+array_fibo[i]>limit;i++){
            array_fibo[i+1] = array_fibo[i-1]+array_fibo[i];
            array_fibo[i+2] =-1;
        }
        return array_fibo;
    }


    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════╗");
        System.out.println("║---------------SOFTFIBONACCI VERSION 1.0------------------║");
        System.out.println("║--------------MAKER: Juan Pablo Orjuela ------------------║");
        System.out.println("║-DESCR: This software calculate the fibonacci series.-----║");
        System.out.println("╚══════════════════════════════════════════════════════════╝");
    }
}
