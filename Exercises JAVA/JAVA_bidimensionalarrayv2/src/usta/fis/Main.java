package usta.fis;
/*
AUTHOR: Juan Orjuela
DATE: 18/05/2021
DESCRIPTION: This is a program with bidimensionalarray.
 */
import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        int [][] matrix;
        int value;
        String columns,rows,input,conten = "";

        JOptionPane.showMessageDialog(null, "Bidimensional Array v2\n" +
                "Author: Juan Orjuela\n"+
                "This program create a dynamic bidimiensional array");

        columns= JOptionPane.showInputDialog(null," Please type the size of the columns: ");
        rows = JOptionPane.showInputDialog("Please type the size of the rows: ");

        matrix= new int[Integer.parseInt(rows)][Integer.parseInt(columns)];

        JOptionPane.showMessageDialog(null,"Please type the values for the  bidimensional array of: "+ rows+" rows and "+columns+" columns");
        // introducir los valores del array
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                input=JOptionPane.showInputDialog("Please type the value array["+i+"] ["+j+"]=");
                value= Integer.parseInt(input);
                matrix[i][j]= value;
            }
        }

        // mostar los valores del array
        for (int i = 0; i < Integer.parseInt(rows); i++) {
            for (int j = 0; j < Integer.parseInt(columns); j++) {
                conten=conten+matrix[i][j]+" ";
            }
            conten= conten + "\n";
        }

        JOptionPane.showMessageDialog(null, "The values introduced are \n"+ conten);
    }

}
