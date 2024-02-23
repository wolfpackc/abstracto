/**
 * Diseña una clase abstracta con un constructor que imprime "Este es un constructor de clase
 * abstracta", un método abstracto llamado abstract_method y un método no abstracto que
 * imprime "Este es un método normal de clase abstracta". Una clase 'SubClase' hereda la clase
 * abstracta y tiene el método llamado abstract_method que imprime "Este es un método
 * abstracto implementado en una clase no abstracta". Ahora crea un objeto de SubClase y llame
 * al método abstracto y al método no abstracto. (Analizar el resultado).
 */
public  abstract class terete1 {

    public terete1(){
        System.out.println("este es un constructor de clase abstracta");
    }

    public abstract void abstract_method();

    public  void method(){
        System.out.println("este es un metodo normal de la clase abstracta");

    }





}