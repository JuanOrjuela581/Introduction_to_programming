package usta.fis;

//Author       :Juan Orjuela
//Date         :23 March of 2021
//Description  :This software calculate time between two cities

 import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_Info_program();
        float v_time=0;
        int v_distance=p_user_distance();
        int v_velocity=p_user_velocity();
        v_time = v_distance/v_velocity;
        System.out.println("The time between two cities is: "+v_time+" hours");
    }
    public  static void p_show_Info_program(){
        //DATE       : 23 March of 2021
        //DESCRIPTION: This method show the info software.
        System.out.println("----------------------------------------");
        System.out.println("!       SoftTimeCycle Version 1.0      !");
        System.out.println("!         MAKER: Juan Orjuela          !");
        System.out.println("DESCR: calculate time between two cities");
        System.out.println("----------------------------------------");
    }
    public static int p_user_distance(){
        Scanner keyboard = new Scanner(System.in);
        int v_distance;
        System.out.println(" Input distance between two cities in KM");
        v_distance= keyboard.nextInt();
        while (v_distance<0){
            System.err.println("ERR: the distance should be grater than zero, Input again the distance between two cities (KM)");
            v_distance= keyboard.nextInt();
        }
        return v_distance;
    }
    public static int p_user_velocity(){
        //Description: this method return the velocity than user input
        Scanner keyboard = new Scanner(System.in);
        System.out.println("input the constance velocity (km/h) between two cities:");
        int v_velocity = keyboard.nextInt();
        while (v_velocity==0){
            System.err.println("ERR: the velocity cannot be same zero, input again tha velocity (KM/H)");
            v_velocity = keyboard.nextInt();
        }
        return v_velocity;
    }
}
