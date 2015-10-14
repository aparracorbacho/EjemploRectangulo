
package ejemplorectangulo;

public class EjemploRectangulo {

    
    public static void main(String[] args) {
        Rectangulo rectangulo1 = new Rectangulo(3,5);
        // System.out.println("Base " +rectangulo1.base); // Se e publico podese acceder así
        System.out.println("Altura: "+rectangulo1.getAltura());
        System.out.println("Base: "+rectangulo1.getBase());
        System.out.println("Area de un rectangulo de 10 de base y 3 de altura "+rectangulo1.calcularArea(10,3));
        System.out.println("Perimetro del primer rectangulo "+rectangulo1.calcularPerimetro());
    }
    
}
