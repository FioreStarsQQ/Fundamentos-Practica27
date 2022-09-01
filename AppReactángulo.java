// Crear la clase Rectángulo que representa a la figura geométrica, me
// importa calcular su área, su perímetro y verificar si es cuadrado.
// Además crear los set y get para cada atributo y 3 métodos
// constructores sobrecargados

public class AppReactángulo {
        public static void main(String[] args) {
                double area1, area2, area3;
                Rectangulo rectangulo1 = new Rectangulo(10, 10);
                Rectangulo rectangulo2 = new Rectangulo(1.3, 1.2);
                Rectangulo rectangulo3 = new Rectangulo();
                rectangulo3.setBase(7);
                rectangulo3.setAltura(2.3);
                area1 = rectangulo1.calcularArea();
                area2 = rectangulo2.calcularArea();
                area3 = rectangulo3.calcularArea();
                System.out.println("Rectángulo N° 1 \n\t>>> Área: " + area1 + " >>> Perímetro: "
                                + rectangulo1.calcularPerimetro() + " >>> ¿Es cuadrado? " + rectangulo1.esCuadrado());
                System.out.println("Rectángulo N° 2 \n\t>>> Área: " + area2 + " >>> Perímetro: "
                                + rectangulo2.calcularPerimetro() + " >>> ¿Es cuadrado? " + rectangulo2.esCuadrado());
                System.out.println("Rectángulo N° 3 \n\t>>> Área: " + area3 + " >>> Perímetro: "
                                + rectangulo3.calcularPerimetro() + " >>> ¿Es cuadrado? " + rectangulo3.esCuadrado());
        }
}
