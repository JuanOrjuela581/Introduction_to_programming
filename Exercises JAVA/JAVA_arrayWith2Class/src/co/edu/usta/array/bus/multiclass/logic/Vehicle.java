package co.edu.usta.array.bus.multiclass.logic;

public class Vehicle {
    private String serviceType;
    private String color;
    private String brand;
    private float width;
    private float height;
    private int doorsNumber;
    private int wheelsNumber;
    private String plates;
    private char[][] places;


    public void setServiceType(String serviceTypeValue){
        serviceType=serviceTypeValue;
    }

    public String getServiceType(){
        return serviceType;
    }

    public void setColor(String colorValue){
        color= colorValue;
    }
    public String getColor(){
        return color;
    }
    public void setBrand(String brandValue){
        brand= brandValue;
    }
    public String getBrand(){
        return brand;
    }

    public void setWidth(float widthValue){
        width=widthValue;
    }
    public float getWidth(){
        return width;
    }
    public void setHeight(float heightValue){
        height=heightValue;
    }
    public float getHeight(){
        return height;
    }
    public void setDoorsNumber(int doorsNumberValue){
        doorsNumber=doorsNumberValue;
    }
    public int getDoorsNumber(){
        return doorsNumber;
    }
    public void setWheelsNumber(int wheelsNumberValue){
        wheelsNumber=wheelsNumberValue;
    }
    public int getWheelsNumber(){
        return wheelsNumber;
    }
    public void setPlates(String platesValue){
        plates= platesValue;
    }
    public String getPlates(){
        return plates;
    }
    public void createPlacesArray(String rows){
        int rowsInt=Integer.parseInt(rows);
        places=new char[rowsInt][4];
    }

    public void initPlacesArray(){
        boolean letter=true;
        //this instruction loop the rows
        for (int i = 0; i < places.length ; i++) {
            //this instruction loop the columns
            for (int j = 0; j <places[0].length; j++) {
                if (letter==true){
                    places[i][j]='D';
                }else{
                    places[i][j]='X';
                }
            }
            if (letter==true){
                letter=false;
            }else{
                letter=true;
            }
        }
    }
    public String arrayToShow(){
        String returnString="";

        for (int i = 0; i < places.length ; i++) {
            for (int j = 0; j < places[0].length; j++) {
                returnString=returnString+places[i][j]+"  ";
            }
            returnString=returnString+"\n";
        }
        return returnString;
    }

    public String fillplaces(String row, String column){
        int rowInt= Integer.parseInt(row);
        int columnInt= Integer.parseInt(column);

        if (places[rowInt][columnInt]=='X'||places[rowInt][columnInt]=='O'){
            return "The place is unavailable ";
        }else{
            places[rowInt][columnInt]='O';
            return "The place is filled ";
        }
    }
    public String statusOfPlaces( ){
        int filledPlaces=0, emptyPlaces=0;
        //code here....
        for (int i = 0; i < places.length ; i++) {
            for (int j = 0; j < places[0].length; j++) {
                if (places[i][j] == 'D') {
                    emptyPlaces++;
                }
                if (places[i][j] == 'O'){
                        filledPlaces++;
                    }
                }
            }
          return "The amount of filled places is: "+filledPlaces+", the amount of empty places is: "+emptyPlaces;
        }
}
