
public class Rectangulo2 implements Redimensional {
    private double ancho;
    private double altura;

    public Rectangulo2(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    @Override
    public void redimensionar(int x) {
        this.ancho *= x;
        this.altura *= x;
    }

    public double getArea() {
        return ancho * altura;
    }

    public double getPerimetro() {
        return 2 * (ancho + altura);
    }

    public static void main(String[] args) {
        Rectangulo2 rectangulo = new Rectangulo2(2, 3);

        System.out.println("Área de rectángulo original:: " + rectangulo.getArea());
        System.out.println("Perímetro del rectángulo original: " + rectangulo.getPerimetro());

        rectangulo.redimensionar(2);

        System.out.println("Área " + rectangulo.getArea());
        System.out.println("Perímetro " + rectangulo.getPerimetro());
    }
}
