package geometria;

public class Circulo extends Figura implements Dibujable {
    double radio;
    

    @Override
    public String dibujar() {
        return "Dibujando";
    }

    @Override
    public double calcularArea(double radio) {
        double area = Math.PI * Math.pow(radio, 2);
        return area;
    }

    @Override
    public double calcularPerimetro(double radio) {
        double perimetro = 2 * radio * Math.PI; 
        return perimetro;
    }

    public Circulo() {
    }    

    public Circulo(double radio) {
        this.radio = radio;
    }

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }



}
