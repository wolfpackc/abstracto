
public class Triangulo extends Forma {
    private double base;
    private double altura;

    public Triangulo(int numLados, double base, double altura) {
        super(numLados);//lamamos a la clase abstracta.
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea() {
        return 0.5 * base * altura;
    }

    @Override
    public double getPerimeter() {
        return 3 * base;
    }
}
