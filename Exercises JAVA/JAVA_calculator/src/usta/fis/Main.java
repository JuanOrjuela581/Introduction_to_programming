package usta.fis;
/*
 *AUTHOR: Juan Pablo Orjuela
 *DATE: 2021-March-15
 *DESCRIPTION: In this program you can realize a sums, subtraction, multiplications and divisions with 2 whole numbers
 */
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        int v_limit = 0;
        int v_operation = 0;
        int v_number_one = 0;
        int v_number_two = 0;
        p_show_info_program();

        Scanner keyboard = new Scanner(System.in);
        do{
            System.out.println("Por favor digite 1 para sumar, 2 para restar, 3 para multiplicar, 4 para dividir, 5 para verificar si es primo, 6 para los numeros primos anteriores al numero introducido");
            v_operation = keyboard.nextInt();
            if (v_operation!=0) {
                System.out.println("Por favor digite el primer numero");
                v_number_one = keyboard.nextInt();
                if (v_operation > 0 && v_operation < 5) ;
                {
                    System.out.println("Por favor digite el segundo numero");
                    v_number_two = keyboard.nextInt();
                }
            }
            System.out.println("El resultado es: " + p_operate_numbers(v_number_one,v_number_two,v_operation, v_limit));
        }while (v_operation!=0);

    }

    public static void p_show_info_program() {
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("║---------------CALCULATOR JAVA VERSION 1.0------------------║");
        System.out.println("║---------------MAKER: Juan Pablo Orjuela--------------------║");
        System.out.println("║--DESCR: This program realize many mathematical operations--║");
        System.out.println("╚════════════════════════════════════════════════════════════╝");
    }

    public static String p_operate_numbers(int v_number_one, int v_number_two, int v_operation,int v_limit) {
        int v_result=0;
        Scanner keyboard = new Scanner(System.in);
        String v_convert="";
        switch (v_operation) {
            case 1:
                v_result=v_number_one+v_number_two;
                break;
            case 2:
                v_result=v_number_one-v_number_two;
                break;
            case 3:
                v_result=v_number_one*v_number_two;
                break;
            case 4:
                v_result=v_number_one/v_number_two;
                break;
            case 5:
                v_convert="No es numero primo";
                if(p_validate_prime(v_number_one)){
                    v_convert= "Es numero primo";
                }
                break;
            case 6:
                v_convert = "Los numeros primos son: "+p_prime_numbers( v_limit,v_number_one, v_convert );
                break;
            default:
                v_convert="Exit";
                System.exit( 0);

        }
        if (v_convert.isEmpty()){
            v_convert=String.valueOf(v_result);
        }
    return v_convert;

    }

    public static String p_prime_numbers(int v_limit, int v_number_one,String v_convert) {
        String prime_numbers = "";
        int [] 
        for (int i =1;i<=v_limit;i++){
            if (p_validate_prime(v_number_one));{
                v_convert = "es numero primo";
            }
        }

        return "";

    }

    public static boolean p_validate_prime (int v_prime){
        int numbers_divide=0;
        for(int i=1;1<=v_prime;i++){
            if (v_prime%i ==0){
                numbers_divide++;
            }
        }
        if (numbers_divide!=2){
            return false;
        }
        return true;
    }
}
