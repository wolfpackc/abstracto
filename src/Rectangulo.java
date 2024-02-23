public class Rectangulo extends Forma {
    private double ancho;
    private double alto;

    public Rectangulo(int numbLads, double anchor, double alto) {
        super(numbLads);
        this.ancho = anchor;
        this.alto = alto;
    }

    @Override
    public double getArea() {
        return ancho * alto;
    }

    @Override
    public double getPerimeter() {
        return 2 * (ancho + alto);
    }
}
