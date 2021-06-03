package co.edu.usta.array.triki.multiclass.logic;

import co.edu.usta.array.triki.multiclass.view.Triki;

import javax.swing.*;

public class FormsView {
    private static Triki myTriki;
    public static void main(String []params) {
        myTriki=new Triki();
        String size, showTriki,row,column,result;
        String[] options ={"PlayerOne","PlayerTwo"};
        int selection,counter=0;
        boolean finish,winnerTriki;

        JOptionPane.showMessageDialog(null,"Hi, this is a triki game developed by: Juan Orjuela\n" +
                "RULES:\n" +
                "Player One is -X- and the Player Two is -O- \n" +
                "Player One have the first turn and Player Two play after him. ");

        size=JOptionPane.showInputDialog("Please type:\n 1 for play with triki of 3*3\n 2 for play triki of 5*5.");
        myTriki.createSpacesArray(size);
        myTriki.initPlacesArray();
        showTriki = myTriki.arrayToShow();
        JOptionPane.showMessageDialog(null, showTriki);
        do {
            selection=JOptionPane.showOptionDialog(null, "What player continue?","Question",JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE,null,options,options[0]);
            row = JOptionPane.showInputDialog("Please type the row to fill");
            column = JOptionPane.showInputDialog("Please type the column to fill");
            showTriki = myTriki.fillplaces(row, column,selection);
            JOptionPane.showMessageDialog(null, showTriki);
            showTriki = myTriki.arrayToShow();
            JOptionPane.showMessageDialog(null, showTriki);
            counter++;
            finish= myTriki.finishGame(counter,size);
            winnerTriki= myTriki.winnerTriki(size);
        }while (finish==true && winnerTriki==true);
        System.out.println(winnerTriki);
        if (winnerTriki==true){
            JOptionPane.showMessageDialog(null,"Both player loose :(");
        }else {
            result = myTriki.showMassageWinner(selection);
            JOptionPane.showMessageDialog(null, result);
        }
        


    }

}

