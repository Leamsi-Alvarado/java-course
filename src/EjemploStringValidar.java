public class EjemploStringValidar {
    public static void main(String[] args) {
        String curso = null;
        boolean esNull = curso == null;

        System.out.println("esNull = " + esNull);
        if (esNull == true) {
            curso = "";//"Programación Java";
        }

        boolean esVacio = curso.length() == 0;

        System.out.println("esVacio = " + esVacio);
        boolean esVacio2 = curso.isEmpty();
        System.out.println("esVacio2 = " + esVacio2);

        boolean esBlanco = curso.isBlank();



        if (esBlanco == false) {
            System.out.println(curso.toUpperCase());
            System.out.println(curso.concat("Bienvenido al curso".concat(curso)));

        }
    }
}
