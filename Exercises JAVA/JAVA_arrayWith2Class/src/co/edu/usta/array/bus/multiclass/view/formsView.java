package co.edu.usta.array.bus.multiclass.view;

import co.edu.usta.array.bus.multiclass.logic.Vehicle;

import javax.swing.*;

public class formsView {
    private static Vehicle myVehicle;

    public static void main(String []params) {
        myVehicle = new Vehicle();
        String value, value2, show_info, show_color, row , column, finishResult;
        float showSize;
        int doors, valueConfirmDialog;
        //1.read the value number of rows
        value = JOptionPane.showInputDialog("Please type the rows of the vehicle");
        //1.1 create a matrix with defined size
        myVehicle.createPlacesArray(value);
        //2. initialize matrix
        myVehicle.initPlacesArray();
        //3. convert the array to string
        do {
        show_info = myVehicle.arrayToShow();
        //3.show in dialog box
        JOptionPane.showMessageDialog(null, show_info);
        //4. request the row
        row=JOptionPane.showInputDialog("Please for your place, type the row to fill: ");
        //4. request the column
        column=JOptionPane.showInputDialog("Please for your place, type the column to fill: ");
        //5. fill the place as unavailable
        show_info = myVehicle.fillplaces(row, column);
        JOptionPane.showMessageDialog(null, show_info);
        //6.request to user for exit or continue
        valueConfirmDialog = JOptionPane.showConfirmDialog(null, "Are you want include another passenger(YES)?\n or leave away the bus (NO) ");
        }while (valueConfirmDialog==JOptionPane.YES_OPTION);
        //7.show info of free and filled places
        finishResult=myVehicle.statusOfPlaces();
        JOptionPane.showMessageDialog(null,finishResult);


/*
        //value2=JOptionPane.showInputDialog("Please type the columns of the vehicle");
        //read value
        value = JOptionPane.showInputDialog("Please type the kind of the service of the vehicle");
        // set the value in the service variable
        myVehicle.setServiceType(value);
        //get the servicetype value stored in the variable
        show_info = myVehicle.getServiceType();
        JOptionPane.showMessageDialog(null, "your kind of service for this vehicle is: " + show_info);

        value = JOptionPane.showInputDialog("Please type the color of the vehicle");
        myVehicle.setColor(value);
        show_color= myVehicle.getColor();
        JOptionPane.showMessageDialog(null,"The color for this vehicle is: "+show_color);

        value = JOptionPane.showInputDialog("Please type the brand of the vehicle");
        myVehicle.setBrand(value);
        show_info=myVehicle.getBrand();
        JOptionPane.showMessageDialog(null,"The brand of the vehicle is: "+ show_info);

        value= JOptionPane.showInputDialog("Please type the with of the vehicle in meters");
        showSize= Float.parseFloat(value);
        myVehicle.setWidth(showSize);
        showSize=myVehicle.getWidth();
        JOptionPane.showMessageDialog(null,"The with of the vehicle is: "+showSize+" meters.");

        value= JOptionPane.showInputDialog("Please type the height of the vehicle in meters");
        showSize= Float.parseFloat(value);
        myVehicle.setHeight(showSize);
        showSize= myVehicle.getHeight();
        JOptionPane.showMessageDialog(null,"The height of the vehicle is: "+showSize+" meters.");

        value= JOptionPane.showInputDialog("Please type the numbers of the doors of the vehicle");
        doors= Integer.valueOf(value);
        myVehicle.setDoorsNumber(doors);
        doors= myVehicle.getDoorsNumber();
        JOptionPane.showMessageDialog(null,"The numbers of the doors is: "+doors);

        value= JOptionPane.showInputDialog("Please type the numbers of the wheels of the vehicle");
        doors= Integer.valueOf(value);
        myVehicle.setWheelsNumber(doors);
        doors=myVehicle.getWheelsNumber();
        JOptionPane.showMessageDialog(null,"The numbers of the wheels is: "+doors);

        value = JOptionPane.showInputDialog("Please type the plates of the vehicle");
        myVehicle.setPlates(value);
        show_color= myVehicle.getPlates();
        JOptionPane.showMessageDialog(null,"The plates of the vehicle is: "+show_color);

 */
    }
}
