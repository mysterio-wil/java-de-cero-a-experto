package Variables;

public class Constantes {
    public static void main(String[] args) {
        System.out.println("*** Constantes en Java ***");
        final var DIAS_DE_SEMANA = 7;
        System.out.println("DIAS_DE_SEMANA: " + DIAS_DE_SEMANA);
        // DIAS_DE_SEMANA = 8; error no se puede reasignar una constante
        final var PI = 3.14159;
        System.out.println("PI: " + PI);
        System.out.println("Math.PI = " + Math.PI);
        final var MENSAJE_DE_BIENVENIDA = "¡Bienvenid@ a la Universidad Java!";
        System.out.println("MENSAJE_DE_BIENVENIDA: " + MENSAJE_DE_BIENVENIDA);
        final var SEGUNDOS_POR_MINUTO = 60;
        System.out.println("SEGUNDOS_POR_MINUTO: " + SEGUNDOS_POR_MINUTO);
    }
}
