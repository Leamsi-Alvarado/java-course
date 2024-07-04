public class EjemploStringMetodos {
    public static void main(String[] args) {
        String name = "Leamsi";

        System.out.println("name.length() = " + name.length());
        System.out.println("name.toUpperCase() = " + name.toUpperCase());
        System.out.println("name.toLowerCase() = " + name.toLowerCase());
        System.out.println("name.equals(\"Leamsi\") = " + name.equals("Leamsi"));
        System.out.println("name.equals(\"Leamsi\") = " + name.equals("leamsi"));
        System.out.println("name.equals(\"leamsi\") = " + name.equalsIgnoreCase("leamsi"));
        System.out.println("name.compareTo(\"Ismael\") = " + name.compareTo("Ismael"));
        System.out.println("name.charAt(2) = " + name.charAt(2));
        System.out.println("name.chart = " + name.charAt(name.length()-1));
        System.out.println("name = " + name.substring(2));
        System.out.println("name.substring(name.length()-2) = " + name.substring(name.length()-2));

        String trabalenguas = "trabalenguas";
        System.out.println("trabalenguas.replace(\"t\", \"i\") = " + trabalenguas.replace("a", "."));
        System.out.println("trabalenguas = " + trabalenguas);
        System.out.println("trabalenguas.indexOf(\"a\") = " + trabalenguas.indexOf("a"));
        System.out.println("trabalenguas = " + trabalenguas.lastIndexOf("a"));
        System.out.println("trabalenguas.indexOf(\"z\") = " + trabalenguas.indexOf("z"));
        System.out.println("trabalenguas.contains(\"traba\") = " + trabalenguas.contains("traba"));
        System.out.println("trabalenguas = " + trabalenguas.startsWith("traba"));
        System.out.println("trabalenguas.endsWith(\"lenguas\") = " + trabalenguas.endsWith("lenguas"));
        System.out.println("    trabalenguas       ");
        System.out.println("    trabalenguas       ".trim());
    }
}
