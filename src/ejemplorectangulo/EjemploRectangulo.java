
package ejemplorectangulo;

import javax.swing.JOptionPane;

public class EjemploRectangulo {

    
    public static void main(String[] args) {
        float base, altura;
        String baseTeclado = JOptionPane.showInputDialog("Introduce la base");
        base = Float.parseFloat(baseTeclado);
        String alturaTeclado = JOptionPane.showInputDialog("Introduce la altura");
        altura = Float.parseFloat(alturaTeclado);
        Rectangulo rectangulo1 = new Rectangulo(base,altura);
        //System.out.println("Base " +rectangulo1.base); // Se e publico podese acceder así
        System.out.println("Altura: "+rectangulo1.getAltura());
        System.out.println("Base: "+rectangulo1.getBase());
        System.out.println("Area de un rectangulo "+rectangulo1.calcularArea(base,altura));
        System.out.println("Perimetro del primer rectangulo "+rectangulo1.calcularPerimetro());
    }
    
}
