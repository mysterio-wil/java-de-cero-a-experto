package Variables;

public class DetalleLibro {
    public static void main(String[] args) {
        // Detalle de un Libro
        String tituloLibro = "El señor de los anillos";
        int anioPublicacion = 1954;
        boolean libroDisponible = true;
        double precio = 500.50;
        // Imprimir el valor de las variables
        System.out.println(tituloLibro);
        System.out.println(anioPublicacion);
        System.out.println(libroDisponible);
        System.out.println(precio);
        // Modificar el titulo de libro
        tituloLibro = "El Señor de los Anillos";
        System.out.println(tituloLibro);
    }
}