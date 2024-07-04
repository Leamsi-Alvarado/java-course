import java.util.Scanner;

public class ProgramaManejoDeNombres {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] completeNames = new String[3];
        String[] lastLetters = new String[3];
        for(int i = 0;  i < 3; i++){
            System.out.println("Enter your name: ");
            String name = scanner.nextLine();
            lastLetters[i] = name.substring(name.length()-2);
            name = name.substring(1,2);
            completeNames[i] = name.concat(".").concat(lastLetters[i]);
        }
        String result;
        result = String.join("_",completeNames);
        System.out.println("result = " + result);


    }
}
