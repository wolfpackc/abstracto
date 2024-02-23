public class subclase extends terete1{

    public subclase() {
        super();
    }

    @Override
    public void abstract_method() {

            System.out.println("Este es un método abstracto implementado en una clase no abstractaa");
    }

    public static void main(String[] args) {
        subclase c1=new subclase();
        c1.abstract_method();
    }
}
