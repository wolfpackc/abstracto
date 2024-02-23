/**
 * Crea una clase Estudiante con atributos nombre, edad y altura. Queremos ordenar por edad y por
 * altura a los estudiantes. Utilizando Comparable y el método compareTo debemos comparar los
 * estudiantes y ordenarlos por altura primero (de mayor a menor) y si la altura coincide por edad.
 * Por pantalla debe mostrarse la lista de estudiantes sin ordenar, y ordenado.
 * Tendré un array de estudiantes para poder probar el programa.
 * Ejemplo:
 * Estudiantes sin ordenar:
 * 1. Patri - Altura: 170 - Edad: 12
 * 2. Manuel - Altura: 173 - Edad: 43
 * 3. Javier - Altura: 189 - Edad: 72
 * 4. Alicia - Altura: 168 - Edad: 52
 * 5. Alberto - Altura: 189 - Edad: 35
 * Estudiantes sin ordenar:
 * 1. Javier - Altura: 189 - Edad: 72
 * 2. Alberto - Altura: 189 - Edad: 35
 * 3. Manuel - Altura: 173 - Edad: 43
 * 4. Patri - Altura: 170 - Edad: 12
 * 5. Alicia - Altura: 168 - Edad: 52
 */
public class Estudiantes implements Comparable<Estudiantes>{
    protected String nombre;
    protected int edad;
    protected int altura;



}
