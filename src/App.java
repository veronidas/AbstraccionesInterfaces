import java.util.Scanner;
import geometria.*;

public class App {

/*Actividad: Geometría abstracta
En esta ocasión, te desafiamos a crear un programa con una jerarquía de clases para representar figuras geométricas abstractas. Este programa debe incluir lo siguiente:

Una clase abstracta denominada “Figura”, que contiene dos métodos abstractos llamados “calcularArea()” y “calcularPerimetro()”.

3 clases para distintas figuras geométricas llamadas  “Círculo”, “Rectángulo” y “Triángulo”. Cada una de estas clases debe extender la clase "Figura" y proporcionar implementaciones concretas de los métodos abstractos.

Para concluir, desarrolla una interfaz llamada "Dibujable" con un método "dibujar()", e implementa esta interfaz en cada figura.

Recuerda invocar estos métodos desde el método main() para demostrar su funcionamiento.
*/
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el radio de un circulo a calcular: ");
        double radio = sc.nextDouble(); 
        Circulo circulo = new Circulo();
        System.out.println(circulo.calcularArea(radio));
        System.out.println(circulo.calcularPerimetro(radio));
        System.out.println(circulo.dibujar());

        sc.nextLine();

        System.out.println("Ingrese el lado de un triangulo a calcular: ");
        double lado = sc.nextDouble(); 
        Triangulo triangulo = new Triangulo();
        System.out.println(triangulo.calcularArea(lado));
        System.out.println(triangulo.calcularPerimetro(lado));
        System.out.println(triangulo.dibujar());

        sc.nextLine();

        System.out.println("Ingrese el ancho y alto de un rectangulo a calcular: ");
        double ancho = sc.nextDouble(); 
        double alto = sc.nextDouble();
        Rectangulo rectangulo = new Rectangulo();
        System.out.println(rectangulo.calcularArea(ancho, alto));
        System.out.println(rectangulo.calcularPerimetro(ancho, alto));
        System.out.println(rectangulo.dibujar());


    }
}
