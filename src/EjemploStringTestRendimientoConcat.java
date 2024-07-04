public class EjemploStringTestRendimientoConcat {
    public static void main(String[] args) {
        String a = "a";
        String b = "b";
        String c = a;

        StringBuilder sb = new StringBuilder(a);
        long inicio = System.currentTimeMillis();

        for (int i = 0; i < 10000; i++) {
            //c = c.concat(a).concat(b).concat("\n"); // 500 => 1ms
            //c += a + b + "\n"; // 500 => 19
            //c = c.concat(a).concat(" ").concat(b).concat("\n"); //
            sb.append(a).append(b).append("\n"); // 500 => 0ms SB  => Concat => +
        }
        long fin = System.currentTimeMillis();
        System.out.println(fin - inicio);
        System.out.println("c = " + c);
        System.out.println("sb.toString() = " + sb.toString());
    }
}
