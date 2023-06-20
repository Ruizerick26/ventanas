import javax.swing.*;

public class pruebapaneldibujo {
    public static void main(String[] args) {
        //Instancia de la clase panel
        paneldibujo panel = new paneldibujo();
        //crear un marco de ventana
        JFrame aplicacion = new JFrame();
        //boton para cerrar ventana
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.add(panel); //agregar panel a la ventana
        aplicacion.setSize(250,250); //settear tamaño de ventana
        aplicacion.setVisible(true); // visualizar ventana

    }
}
