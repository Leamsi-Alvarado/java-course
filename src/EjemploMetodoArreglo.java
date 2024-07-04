import java.sql.SQLOutput;

public class EjemploMetodoArreglo {
    public static void main(String[] args) {
        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.toCharArray() = " + trabalenguas.toCharArray());

        char[] array = trabalenguas.toCharArray();
        int largo = array.length;
        System.out.println("largo = " + largo);
        for(int i = 0; i < largo; i++){
            System.out.println("array = " + array[i]);
        }

        System.out.println("\ntrabalenguas = " + trabalenguas.split("a"));

        String[] array2 = trabalenguas.split("a");
        int l = array2.length;
        for(int j = 0; j < l; j++){
            System.out.println(array[j]);
        }

        String archivo = "alguna.imagen.json";

        String[] archivoArr = archivo.split("\\.");
        l = archivoArr.length;
        System.out.println("l = " + l);
        
        for(int j = 0; j < l; j++){
            System.out.println("archivoArr[j] = " + archivoArr[j]);
        }

        System.out.println("archivoArr = " + archivoArr[l-1]);

    }
}
