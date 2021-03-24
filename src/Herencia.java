public class Herencia {
    public static void main(String[] args) {
        Rectangulo rect = new Rectangulo(5.0 , 4.0);
        System.out.println(rect);

        System.out.println("Área: " + rect.getArea());
        System.out.println("Perímetro: " + rect.getPerimetro());
    }
}
