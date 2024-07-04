public class EjemploStringConcatenacion {
    public static void main(String[] args) {
        String curso = "Programación JAVA";
        String profesor = "Andrés Guzmán";

        String detalle = curso + "Con el instructor" + profesor;
        System.out.println(detalle);

        int numeroA = 10;
        int numeroB = 5;
        System.out.println(detalle + (numeroA + numeroB));
        System.out.println(numeroA + numeroB + detalle);

        String detalle2 = curso.concat(" ".concat(profesor));
        System.out.println("detalle2 = " + detalle2);
    }
}
