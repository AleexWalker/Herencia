public class Rectangulo {
    private double ancho;
    private double largo;

    public Rectangulo() {
    }

    public Rectangulo(double ancho, double largo) {
        this.ancho = ancho;
        this.largo = largo;
    }

    public double getAncho() {
        return ancho;
    }

    public double getLargo() {
        return largo;
    }

    public double getArea(){
        double area = ancho * largo;
        return area;
    }

    public double getPerimetro(){
        double perimetro = (2 * ancho) + (2 * largo);
        return perimetro;
    }

    @Override
    public String toString() {
        return "El Rectangulo tiene " +
                + ancho + " cm de ancho y " +
                + largo + " cm de largo.";
    }
}
