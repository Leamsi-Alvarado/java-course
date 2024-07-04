import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String variable = 7 == 5 ? "Si es verdadero" : "Si es falso";
        System.out.println("variable = " + variable);

        String estado = "";
        System.out.println("las calificaciones deberan ser de 0 a 100");
        System.out.println("Ingrese calificacion de math: ");
        int math = scanner.nextInt();
        System.out.println("Ingrese calificacion de hist: ");
        int hist = scanner.nextInt();
        System.out.println("Ingrese calificacion de cienc:");
        int cienc = scanner.nextInt();

        double promedio = (math + hist + cienc) / 3;


        estado = promedio > 70? "aprovado": "rechazado";
        System.out.println("estado = " + estado);
    }
}
