package Variables;

public class ReservaHoteles {
    public static void main(String[] args) {
        System.out.println("*** Sistema de Reserva de Hoteles ***");

        // Definicion de las variables
        String nombreCliente = "Juan";
        int diasDeEstancia = 3;
        double tarifaDiaria = 100.00;
        boolean conVistaAlMar = true;

        // Imprimir detalle de reserva de hoteles
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días de estancia: " + diasDeEstancia);
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Habitación con vista al mar: " + conVistaAlMar);

        // Modificar los valores
        nombreCliente = "Pedro";
        diasDeEstancia = 5;
        tarifaDiaria = 150.00;
        conVistaAlMar = false;

        // Imprimir detalle de reserva de hoteles después de modificar
        System.out.println("\n *** Detalles de Reserva de Hoteles ***");
        System.out.println("Nombre del cliente: " + nombreCliente);
        System.out.println("Días de estancia: " + diasDeEstancia);
        System.out.println("Tarifa diaria: $" + tarifaDiaria);
        System.out.println("Habitación vista al mar: " + conVistaAlMar);
    }
}