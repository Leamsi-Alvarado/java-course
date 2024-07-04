import java.text.MessageFormat;
import java.util.Scanner;

public class DetalleDeFactura {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese la razón social");
        String name = scanner.nextLine();
        System.out.println("Ingrese el primer precio");
        double priceOne = scanner.nextDouble();
        System.out.println("Ingrese el segundo precio");
        double priceTwo = scanner.nextDouble();
        System.out.println("Calculando...");
        double tax = taxCalculator(priceOne, priceTwo);
        String result = MessageFormat.format("La factura producto de oficina tiene un total bruto {0} de , con un impuesto de {1}, con un total de {2}, a nombre de {3}", priceOne + priceTwo, tax, priceOne + priceTwo + tax, name);
        System.out.println(result);


    }

    public static double taxCalculator(double price1, double price2){
        double tax = (price1 + price2) * 0.19;
        return tax;
    }
}
