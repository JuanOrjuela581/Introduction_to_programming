package usta.fis;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	int numberOne = 0;
	int numberTwo = 0;
	int result = 0;
	int operationNum = 0;
	Scanner keyboard = new Scanner(System.in);
	p_show_info_program();
	System.out.println("Please type the aritmetic operation: 1 to add, 2 to substract, 3 multiply, 4 divide, 5 to validate prime number");
	operationNum = keyboard.nextInt();
	System.out.println("Please type the first number");
	numberOne = keyboard.nextInt();
	System.out.println("Please type the second number");
	numberTwo = keyboard.nextInt();

	calc_operation(numberOne,numberTwo,operationNum);

	result = calc_operation(numberOne,numberTwo,operationNum);
	System.out.println("The result is: " +result );

    }


    public static int calc_operation(int number1, int number2, int operation) {

        if (operation == 1) {
            return number1+number2;}
        if (operation == 2){
            return number1-number2;
        }
        if (operation ==3){
            return number1*number2;
        }
        if (operation == 4 && number2 !=0){
            return number1/number2;
        }
        if (operation == 5 ){
            System.out.println("its not a prime number");
            if (p_validate_prime(number1));
            System.out.println("Its a prime number");
            return number1;
        }
        return 0;
    }

    public static boolean p_validate_prime(int prime){
       int div_number = 0;
       for (int i=1;i<=prime;i++){
           if (prime % i ==0){
               div_number++;
           }
       }
       if (div_number !=2){
           return false;
       }
       return true;
    }


    public static void p_show_info_program() {
        System.out.println("╔══════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("║-----------------------CALCULATORSOFT VERSION 1.0-----------------------------║");
        System.out.println("║-----------------------MAKER: Juan Pablo Orjuela------------------------------║");
        System.out.println("║------DESCR: This program add, substract, multiply and divide 2 numbers .-----║");
        System.out.println("╚══════════════════════════════════════════════════════════════════════════════╝");
    }
}
