import javax.swing.*;
import java.awt.*;

public class paneldibujo extends JPanel{
    public String Nombre;
    public float peso;
    public float altura;

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }
    public String IMC(float altura, float peso){
            float imc = (float) (peso / (Math.pow(altura,2)));
            String imc_t= Float.toString(imc);
        return imc_t;

    }


    public void paintComponent(Graphics g){
        super.paintComponent(g);
        int ancho = getWidth();
        int alto = getHeight();

        //g.drawLine(10,10,80,10);
        //g.drawLine(10,50,80,50);
        //g.drawLine(10,90,80,90);

        //g.drawLine(10,10,10,90);

        //g.drawString("RCEE",20,20);
        g.drawString(getNombre(),50,50);
        g.drawString(IMC(getPeso(),getAltura()),50,70);

    }
}

