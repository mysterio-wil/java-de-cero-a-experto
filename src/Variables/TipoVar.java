package Variables;

public class TipoVar {
    public static void main(String[] args) {
        System.out.println("Uso de var en Java");
        // Sin el uso de var
        String nombre1 = "Juan";
        System.out.println("nombre1: " + nombre1);
        // Con el uso de var
        var nombre2 = "Pedro";
        System.out.println("nombre2: " + nombre2);
        //Definir otras variables usando
        var edad = 30;
        System.out.println("edad: " + edad);
        var sueldo = 50000.00F; // Se infiere tipo float
        System.out.println("sueldo: " + sueldo);
        var esCasado = false; // Se infiere tipo boolean
        esCasado = true;
        //esCasado = "No"; // No podemos asignar un tipo distinto
        var altura = 1.75;
        System.out.println("altura: " + altura);
        var isMayorDeEdad = true;
        System.out.println("isMayorDeEdad: " + isMayorDeEdad);

        // Se debe definir su valor
        // var precio; esto lanza error, tenemos que asignar
        // precio = 10;

        // Se debe poder inferir en el tipo de dato
        // var apellido = null; no se puede inferir el tipo de dato
    }
}