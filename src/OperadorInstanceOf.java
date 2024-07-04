public class OperadorInstanceOf {
    public static void main(String[] args) {
        String text = "Creando un objeto de clase String ... holi!";

        Integer num = 45;

        boolean b1 = text instanceof String;

        System.out.println("Texto del tipo String" + b1);

        b1 = text instanceof  Object;

        System.out.println("text object = " + b1);

        b1 = num instanceof Number;

        System.out.println(b1);
    }
}
