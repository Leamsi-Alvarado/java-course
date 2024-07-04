import javax.swing.*;
import java.util.Scanner;

public class TareasSeccion4 {
    public static void main(String[] args) {
        //assignment4();
        // assignment5();
        assignment6();
    }


    public static void assignment5() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el valor de litros: ");
        double lt = scanner.nextDouble();


        if (lt >= 70) {
            System.out.println("Estanque lleno");
        } else if (lt >= 60 && lt < 70) {
            System.out.println("Estanque casi lleno");
        } else if (lt >= 40 && lt < 60) {
            System.out.println("Estanque 3/4");
        } else if (lt >= 35 && lt < 40) {
            System.out.println("Estanque a la mitad");
        } else if (lt >= 20 && lt < 35) {
            System.out.println("Suficientes");
        } else if (lt >= 1 && lt < 20) {
            System.out.println("Insuficiente");
        }
    }

    public static void assignment4() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el primer numero:");
        int num1 = scanner.nextInt();
        System.out.println("Ingrese el segundo numero");
        int num2 = scanner.nextInt();

        int max = 0;

        max = num1 > num2 ? num1 : num2;
        System.out.println("El numero mayor es: " + max);
    }

    public static void assignment6() {
        String name1 = JOptionPane.showInputDialog("Ingresa el nombre de la primera pesona");
        String name2 = JOptionPane.showInputDialog("Ingresa el nombre de la segunda persona");
        String name3 = JOptionPane.showInputDialog("Ingresa el nombre de la tercera persona");

        String reducedName1 = name1.trim();
        String reducedName2 = name2.trim();
        String reducedName3 = name3.trim();

        if (reducedName1.length() > reducedName2.length() && reducedName1.length() > reducedName3.length()) {
            System.out.println("la persona con el nombre mas largo es ".concat(name1));
        } else if (reducedName2.length() > reducedName1.length() && reducedName2.length() > reducedName3.length()) {
            System.out.println("la persona con el nombre mas largo es ".concat(name2));
        } else {
            System.out.println("la persona con el nombre mas largo es ".concat(name3));
        }
    }
}
