/**
 *
 * @author aparracorbacho
 */


package ejemplorectangulo;


public class Rectangulo {
    private float base;
    private float altura;
    
    //constructores
    public Rectangulo(){
    }
    public Rectangulo(float ba,float alt){
    base = ba;
    altura = alt;
    }
    //metodos de acceso
    public void setBase (float ba){
        base = ba;
    }
    public float getBase (){
        return base;
    }
    public void setAltura (float alt){
        altura = alt;
    }
    public float getAltura (){
        return altura;
    }
    public float calcularArea (float base, float altura){
        float area;
        area = base * altura;
        return area;
    }
    public float calcularPerimetro (){
        float perimetro;
        perimetro = (base*2) + (altura*2);
        return perimetro;
    }
  
    
    
}
