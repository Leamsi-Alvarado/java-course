import javax.swing.*;

public class OperadorAritmetico {
    public static void main(String[] args) {
        int i = 4, j = 5;

        int suma = i + j;

        System.out.println(" suma " + suma);
        System.out.println("i + j = " + (i + j));
        
        int resta = i - j;
        System.out.println("resta = " + resta);
        System.out.println("i-j = " + (i-j));

        int multi = i * j;
        System.out.println("multi = " + multi);
        System.out.println("(i*j) = " + (i*j));

        int div = i / j;
        float div2 = (float)i / (float)j;
        System.out.println("div = " + div);
        System.out.println("(i/j) = " + (i/j));

        int resto = 8 % 5;
        System.out.println("resto = " + resto);

        int numero = Integer.parseInt(JOptionPane.showInputDialog("Ingrese un numero:"));
        if (numero % 2 == 0){
            System.out.println("numero par= " + numero);
        }
        else{
            System.out.println("numero impar = " + numero);
        }

        
    }
}
