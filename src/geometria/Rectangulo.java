package geometria;

public class Rectangulo extends Figura implements Dibujable{

    double ancho;
    double alto;

    @Override
    public double calcularArea(double ancho, double alto) {
        double area = ancho * alto;
        return area;
    }

    @Override
    public double calcularPerimetro(double ancho, double alto) {
        double perimetro = (2 * ancho) + (2 * alto);
        return perimetro;
    }

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double alto) {
        this.ancho = ancho;
        this.alto = alto;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public double getAlto() {
        return alto;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    @Override
    public String dibujar() {
        return "Dibujando";
    }

    

}
