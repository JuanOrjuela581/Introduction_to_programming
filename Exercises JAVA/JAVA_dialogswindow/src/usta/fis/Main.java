package usta.fis;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        // Ventanas de informacion, no devuelven variable

        // muestra solo un mensaje dentro de la ventana
        JOptionPane.showMessageDialog(null,"Operacion realizada exitosamente");


        // muestra el titulo de la ventana, el contenido de la ventana y el icono de la ventana
        JOptionPane.showMessageDialog(null,"Mensaje dentro de la ventana", "Titulo de la ventana",JOptionPane.INFORMATION_MESSAGE);
//==============================================================================================================
        // cuadros que interactuan con el usuario, devuelven una variable tipo string

        // Dialogo en donde tienes un enunciado
        String respuesta = JOptionPane.showInputDialog("Escribe tu nombre: ");
        System.out.println("Tu nombre es: "+ respuesta);

        //dialogo donde tienes el enunciado, y te sugiere una respuesta
        String respuesta1 = JOptionPane.showInputDialog("¿Cual es su nombre?","Juan");
        System.out.println("Tu nombre es: "+ respuesta1);

        // Igual que el primero pero en este caso se puede aplicar a un componente
        String respuesta2 = JOptionPane.showInputDialog (null,"Escribe tu nombre");
        System.out.println("Tu nombre es: "+ respuesta2);

        // donde te sugiere una respuesta pero aplicado a un componente
        String respuesta3 = JOptionPane.showInputDialog (null, "¿Cual es su nombre?", " Juan");
        System.out.println("Tu nombre es: "+ respuesta3);


        //EN este caso tenemos componente, mensaje, titulo, tipo de icono que aparece.
        String respuesta4 = JOptionPane.showInputDialog(null,"Introduzca nuevamente su nombre:","Atencion!",JOptionPane.ERROR_MESSAGE);
        System.out.println("Tu nombre es: "+ respuesta4);

//==============================================================================================================
        //cuadros de confirmacion:  si seleccionamos; SI retornará un cero, si es NO un 1 y si es CANCELAR un 2.

        // en este caso esta componente, mensaje.
        int respuesta5 = JOptionPane.showConfirmDialog(null,"Esta seguro?");
        System.out.println("el entero de la confirmacion es: "+ respuesta5);

        // COMPONENTE, MENSAJE, TITULO, TIPOS O CANTIDAD DE BOTONES DISPONIBLES
        int respuesta6 = JOptionPane.showConfirmDialog(null,"Estas seguro?!","Cuidado!",JOptionPane.YES_NO_OPTION);
        System.out.println("el entero de la confirmacion es: "+ respuesta6);

        // COMPONENTE, MENSAJE, TITULO, TIPOS DE BOTONES, TIPO DE MENSAJE O ICONO.
        int respuesta7 = JOptionPane.showConfirmDialog(null,"Completamente seguro?!","OJO",JOptionPane.YES_NO_CANCEL_OPTION,JOptionPane.WARNING_MESSAGE);
        System.out.println("el entero de la confirmacion es: "+ respuesta7);
//==============================================================================================================
    }
}
