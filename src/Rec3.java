import java.util.Arrays;

public class Rec3 implements Comparable<Rec3> {
    private double ancho;
    private double altura;

    public Rec3(double ancho, double altura) {
        this.ancho = ancho;
        this.altura = altura;
    }

    public double getArea() {
        return ancho * altura;
    }

    @Override
    public int compareTo(Rec3 otroRectangulo) {
        double areaActual = this.getArea();
        double areaOtro = otroRectangulo.getArea();

        if (areaActual < areaOtro) {
            return -1;
        } else if (areaActual > areaOtro) {
            return 1;
        } else {
            return 0;
        }
    }

    @Override
    public String toString() {
        return "Rectángulo (Área:" + getArea() ;
    }

    public static void main(String[] args) {

    }
}
