public class SentenciaForEach {
    public static void main(String[] args) {
        int[] numeros = {1,2,3,4,5,6,8,9};
        for(int num: numeros){
            System.out.println("num = " + num);
        }
        String[] names = {"andres", "pepe", "elefante", "todas", "aun mas todas"};
        for(String nam: names){
            System.out.println("nam = " + nam);
        }
    }
}
