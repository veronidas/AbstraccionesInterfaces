package geometria;

public class Triangulo extends Figura implements Dibujable{

    
    @Override
    public double calcularArea(double lado) {
        double area = (lado * lado) / 2;
        return area;
    }

    @Override
    public double calcularPerimetro(double lado) {
        double perimetro = lado * 3;
        return perimetro;
    }

    double lado;

    public Triangulo() {
    }

    public Triangulo(double lado) {
        this.lado = lado;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    @Override
    public String dibujar() {
        return "Dibujando";
    }


}
