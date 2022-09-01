// CLASE RECTANGULO
public class Rectangulo {
    private double baseRectangulo, alturaRectangulo;
    // Constructor con parametro numeros enteros
    public Rectangulo(int base, int altura) {
        setBase(base);
        setAltura(altura);
    }    
    // Constructor con parametro numeros reales
    public Rectangulo(double base, double altura) {
        setBase(base);
        setAltura(altura);
    }   
    // Constructor sin parametro
    public Rectangulo() {
        setBase(0);
        setAltura(0);
    }
    // Establece el valor de la base
    public void setBase(double base) {
        baseRectangulo = base;
    }
    // Establece el valor de la altura
    public void setAltura(double altura) {
        alturaRectangulo = altura;
    } 
    // Devuelve el valor que fue almacenado en la variable baseRectangulo
    public double getBase() {
        return baseRectangulo;
    }
    // Devuelve el valor que fue almacenado en la variable alturaRectangulo
    public double getAltura() {
        return alturaRectangulo;
    }
    // Devuelve el valor de verdad de si es cuadrado o no
    public boolean esCuadrado() {
        return baseRectangulo == alturaRectangulo;
    }    
    // Devuelve el area del rectangulo
    public double calcularArea() {
        return baseRectangulo * alturaRectangulo;
    }    
    // Devuelve el perimetro
    public double calcularPerimetro() {
        return getBase() *2+ getAltura()*2;
    }
}
