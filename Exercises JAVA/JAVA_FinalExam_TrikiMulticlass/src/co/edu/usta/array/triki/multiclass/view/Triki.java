package co.edu.usta.array.triki.multiclass.view;

public class Triki {
    private char[][] spaces;

    public void createSpacesArray(String size) {

        int sizeInt = Integer.parseInt(size);
        if (sizeInt == 1) {
            spaces = new char[3][3];
        }else{
            spaces = new char[5][5];

        }
    }

    public void initPlacesArray() {

        //this instruction loop the rows
        for (int i = 0; i < spaces.length; i++) {
            //this instruction loop the columns
            for (int j = 0; j < spaces[0].length; j++) {
                spaces[i][j]='_';
            }
        }
    }

    public String arrayToShow () {
        String returnString = "";

        for (int i = 0; i < spaces.length; i++) {
            for (int j = 0; j < spaces[0].length; j++) {
                returnString = returnString + spaces[i][j] + "    ";
            }
            returnString = returnString + "\n";
        }
        return returnString;
    }

    public String fillplaces(String row, String column,int selection){


        int rowInt= Integer.parseInt(row);
        int columnInt= Integer.parseInt(column);

        if (spaces[rowInt][columnInt]=='X'||spaces[rowInt][columnInt]=='O'){
            return "The place is unavailable ";
        }else{
            if (selection==0){
            spaces[rowInt][columnInt]='X';
            return "The place is filled ";
            }else{
                spaces[rowInt][columnInt]='O';
                return "The place is filled ";
            }

        }
    }
    public boolean finishGame(int counter,String size){
        boolean letter= true;
        int sizeInt = Integer.parseInt(size);

        if (sizeInt==1){
            if (counter==9){
                letter=false;
            }
        }else{
            if (counter==25){
                letter=false;
            }
        }
        return letter;
    }
    public boolean winnerTriki(String size){
        boolean letter = true;
        int sizeInt = Integer.parseInt(size);


        if (sizeInt==1){
            if (spaces[0][0]=='X'&&spaces[0][1]=='X'&&spaces[0][2]=='X'||spaces[0][0]=='O'&&spaces[0][1]=='O'&&spaces[0][2]=='O'
            ||spaces[1][0]=='X'&&spaces[1][1]=='X'&&spaces[1][2]=='X'||spaces[1][0]=='O'&&spaces[1][1]=='O'&&spaces[1][2]=='O'
            ||spaces[2][0]=='X'&&spaces[2][1]=='X'&&spaces[2][2]=='X'||spaces[2][0]=='O'&&spaces[2][1]=='O'&&spaces[2][2]=='O'){
                letter=false;
            }

            if (spaces[0][0]=='X'&&spaces[1][0]=='X'&&spaces[2][0]=='X'||spaces[0][0]=='O'&&spaces[1][0]=='O'&&spaces[2][0]=='O'
            || spaces[0][1]=='X'&&spaces[1][1]=='X'&&spaces[2][1]=='X'||spaces[0][1]=='O'&&spaces[1][1]=='O'&&spaces[2][1]=='O'
            ||spaces[0][2]=='X'&&spaces[1][2]=='X'&&spaces[2][2]=='X'||spaces[0][2]=='O'&&spaces[1][2]=='O'&&spaces[2][2]=='O'){
            letter=false;
            }

            if (spaces[0][0]=='X'&&spaces[1][1]=='X'&&spaces[2][2]=='X'||spaces[0][0]=='O'&&spaces[1][1]=='O'&&spaces[2][2]=='O'
            ||spaces[2][0]=='X'&&spaces[1][1]=='X'&&spaces[0][2]=='X'||spaces[2][0]=='O'&&spaces[1][1]=='O'&&spaces[0][2]=='O'){
                letter=false;
            }
        }else{
            if(spaces[0][0]=='X'&&spaces[0][1]=='X'&&spaces[0][2]=='X'&&spaces[0][3]=='X'&&spaces[0][4]=='X'||spaces[0][0]=='O'&&spaces[0][1]=='O'&&spaces[0][2]=='O'&&spaces[0][3]=='O'&&spaces[0][4]=='O'
            ||spaces[1][0]=='X'&&spaces[1][1]=='X'&&spaces[1][2]=='X'&&spaces[1][3]=='X'&&spaces[1][4]=='X'||spaces[1][0]=='O'&&spaces[1][1]=='O'&&spaces[1][2]=='O'&&spaces[1][3]=='O'&&spaces[1][4]=='O'
            ||spaces[2][0]=='X'&&spaces[2][1]=='X'&&spaces[2][2]=='X'&&spaces[2][3]=='X'&&spaces[2][4]=='X'||spaces[2][0]=='O'&&spaces[2][1]=='O'&&spaces[2][2]=='O'&&spaces[2][3]=='O'&&spaces[2][4]=='O'
            ||spaces[3][0]=='X'&&spaces[3][1]=='X'&&spaces[3][2]=='X'&&spaces[3][3]=='X'&&spaces[3][4]=='X'||spaces[3][0]=='O'&&spaces[3][1]=='O'&&spaces[3][2]=='O'&&spaces[3][3]=='O'&&spaces[3][4]=='O'
            ||spaces[4][0]=='X'&&spaces[4][1]=='X'&&spaces[4][2]=='X'&&spaces[4][3]=='X'&&spaces[4][4]=='X'||spaces[4][0]=='O'&&spaces[4][1]=='O'&&spaces[4][2]=='O'&&spaces[4][3]=='O'&&spaces[4][4]=='O'){
                letter=false;
            }
            if(spaces[0][0]=='X'&&spaces[1][0]=='X'&&spaces[2][0]=='X'&&spaces[3][0]=='X'&&spaces[4][0]=='X'||spaces[0][0]=='O'&&spaces[1][0]=='O'&&spaces[2][0]=='O'&&spaces[3][0]=='O'&&spaces[4][0]=='O'
            ||spaces[0][1]=='X'&&spaces[1][1]=='X'&&spaces[2][1]=='X'&&spaces[3][1]=='X'&&spaces[4][1]=='X'||spaces[0][1]=='O'&&spaces[1][1]=='O'&&spaces[2][1]=='O'&&spaces[3][1]=='O'&&spaces[4][1]=='O'
            ||spaces[0][2]=='X'&&spaces[1][2]=='X'&&spaces[2][2]=='X'&&spaces[3][2]=='X'&&spaces[4][2]=='X'||spaces[0][2]=='O'&&spaces[1][2]=='O'&&spaces[2][2]=='O'&&spaces[3][2]=='O'&&spaces[4][2]=='O'
            ||spaces[0][3]=='X'&&spaces[1][3]=='X'&&spaces[2][3]=='X'&&spaces[3][3]=='X'&&spaces[4][3]=='X'||spaces[0][3]=='O'&&spaces[1][3]=='O'&&spaces[2][3]=='O'&&spaces[3][3]=='O'&&spaces[4][3]=='O'
            ||spaces[0][4]=='X'&&spaces[1][4]=='X'&&spaces[2][4]=='X'&&spaces[3][3]=='X'&&spaces[4][4]=='X'||spaces[0][4]=='O'&&spaces[1][4]=='O'&&spaces[2][4]=='O'&&spaces[3][4]=='O'&&spaces[4][4]=='O'){
                letter=false;
            }
            if (spaces[0][0]=='X'&&spaces[1][1]=='X'&&spaces[2][2]=='X'&&spaces[3][3]=='X'&&spaces[4][4]=='X'||spaces[0][0]=='O'&&spaces[1][1]=='O'&&spaces[2][2]=='O'&&spaces[3][3]=='O'&&spaces[4][4]=='O'
            ||spaces[4][0]=='X'&&spaces[3][1]=='X'&&spaces[2][2]=='X'&&spaces[1][3]=='X'&&spaces[0][4]=='X'||spaces[4][0]=='O'&&spaces[3][1]=='O'&&spaces[2][2]=='O'&&spaces[1][3]=='O'&&spaces[0][4]=='O'){
                letter=false;
            }
        }
        return letter;
    }

    public String showMassageWinner(int selection){
        String massage="";
        if(selection==0){
            massage="The winner is the PlayerOne :)";
        }else {
            massage="The winner is the PlayerTwo :)";
        }

        return massage;
    }

}

