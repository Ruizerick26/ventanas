import javax.swing.*;
import java.util.Scanner;

public class pruebapaneldibujo {
    public static void main(String[] args) {
        Scanner rc=new Scanner(System.in);
        String Nombre;

        System.out.println("Ingrese su nombre");
        Nombre=rc.nextLine();
        System.out.println("Ingrese su altura:");
        float altura = rc.nextFloat();
        System.out.println("Ingrese su peso en kg:");
        float peso = rc.nextFloat();

        //Instancia de la clase panel
        paneldibujo panel = new paneldibujo();
        //crear un marco de ventana
        JFrame aplicacion = new JFrame();
        panel.setNombre(Nombre);
        panel.setPeso(peso);
        panel.setAltura(altura);
        //boton para cerrar ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); //agregar panel a la ventana
        aplicacion.setSize(250,250); //settear tamaño de ventana
        aplicacion.setVisible(true); // visualizar ventana





    }
}
