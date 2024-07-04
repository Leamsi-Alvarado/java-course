import java.util.Scanner;

public class TareasSeccion5 {
    public static void main(String[] args) {

    }

    public static void assignment8(){
        Scanner sc = new Scanner(System.in);
        double[] grades = new double[20];
        for(int i = 0; i < 20; i++) {
            System.out.println("Please add the new grade");
            grades[i] =  sc.nextDouble();
        }
        for(double grade:grades){

        }
    }


    public static void assignment7(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa la cantidad de numeros a jugar debe ser mayor que 10");
        int quantity = scanner.nextInt();
        boolean approved = quantity > 10 ? true : false;
        if (approved) {
            System.out.println("Bien comencemos a jugar!");
            int num = 0;
            int menor = Integer.MAX_VALUE;
            for (int i = 0; i <= quantity; i++) {
                num = scanner.nextInt();
                menor = num < menor ? num : menor;
            }
            System.out.println("menor = " + menor);
        } else {
            System.out.println("Debes agregar como cantidad al menos 10");

        }
    }
}
