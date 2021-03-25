package usta.fis;

//Author       :Juan Orjuela
//Date         :25 March of 2021
//Description  :this software calculate the total money saved in the year
  import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        p_show_Info_program();
        int v_total_saved=0;
         for (int i=1;i<=12;i=i+1) {
             System.out.println("---Month "+i+"----");
             v_total_saved=v_total_saved+p_user_saved_money();
         }
         System.out.println("The total saved money in year is $:"+v_total_saved);

    }
    public static void p_show_Info_program() {
        //DESCRIPTION: This method show the info software.
        System.out.println("----------------------------------------");
        System.out.println("!       SoftSaveMoney Version 1.0      !");
        System.out.println("!         MAKER: Juan Orjuela          !");
        System.out.println("          DATE: 2021 March 25           ");
        System.out.println("----------------------------------------");
    }
    public static int p_user_saved_money(){
        //DESCRIPTION: this method return the saved money in the month
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Input the saved money in the month (COP):");
        int v_saved_money = keyboard.nextInt();
        while (v_saved_money<0){
            System.err.println("ERR: Your saved money cannot be less than zero, input again the saved money (COP)");
            v_saved_money= keyboard.nextInt();
        }
        return v_saved_money;
    }
}