/**
 * 2.En java Diseña una jerarquía de clases que empiece en la clase Employee que incluya subclases para
 * HourlyEmployee y SalaryEmployee. Los atributos compartidos por estas clases incluyen el
 * nombre y el cargo del empleado, además de los métodos getter y setter necesarios para esos
 * atributos. Los empleados asalariados necesitan un atributo para el salario semanal y los métodos
 * correspondientes para acceder y cambiar esta variable. Los empleados por hora deben tener una
 * tasa de pago y una variable de horas trabajadas. Debería haber un método abstracto llamado
 * "calculateWeeklyPay()", definido de forma abstracta en la superclase e implementado en las
 * subclases. La paga del trabajador asalariado es solo el salario semanal. El pago de un empleado
 * por hora es simplemente la tarifa de pago por horas trabajadas.
 */

public abstract class Employee {
    private String name;
    private String jobTitle;


    public Employee(String name, String jobTitle) {
        this.name = name;
        this.jobTitle = jobTitle;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }


    public abstract double calculateWeeklyPay();
}
