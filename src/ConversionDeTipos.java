public class ConversionDeTipos {
    public static void main(String[] args) {
        String numeroSTR = "50";
        
        int numeroInt = Integer.parseInt(numeroSTR);
        System.out.println("numeroInt = " + numeroInt);
        
        
        String realStr = "9872.12e-3";
        double realDouble = Double.parseDouble(realStr);
        System.out.println("realDouble = " + realDouble);
        
        String logicoStr = "TrUe";
        boolean logicoBool = Boolean.parseBoolean(logicoStr);
        System.out.println("logicoBool = " + logicoBool);
        
        int otroNumeroInt = 100;
        System.out.println("otroNumeroInt = " + otroNumeroInt);
        String otroNumeroStr = Integer.toString(otroNumeroInt);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        otroNumeroStr = String.valueOf(otroNumeroInt+10);
        System.out.println("otroNumeroStr = " + otroNumeroStr);
        
        double otroRealDouble = 21.21312e2;
        String otroRealStr = Double.toString(otroRealDouble);
        System.out.println("otroRealStr = " + otroRealStr);


        otroRealStr = String.valueOf(otroRealDouble+1);
        System.out.println("otroRealStr = " + otroRealStr);
        
        
        
        
        int i  = 32767;
        short s = (short)i;
        System.out.println("s = " + s);
        long l = i;
        System.out.println("l = " + l);
        char b = (char) i;
        System.out.println("b = " + b);
        float f = (float)i;
        System.out.println("f = " + f);
    }
}
