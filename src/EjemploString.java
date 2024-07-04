public class EjemploString {
    public static void main(String[] args) {
        String curso = "Programación JAVA";
        String curso2 = new String("Programación JAVA");
        
        boolean esIgual = curso == curso2;
        System.out.println(" curso == curso2: " + esIgual);
        esIgual = curso.equals(curso2);
        System.out.println("curso.equals(curso2): " + esIgual);

        String curso3 = "Programación JAVA";
        esIgual = curso == curso3;
        System.out.println("curso == curso3: " + esIgual);
    }
}
