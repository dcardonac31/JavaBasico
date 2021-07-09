
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        //convertir un String a un tipo int
        var edad = Integer.parseInt("20");
        System.out.println("edad = " + edad);
        
        double valorPI = Double.parseDouble("3.1416");
        System.out.println("valorPI = "+ valorPI);
        
        char c = "hola".charAt(3);
        System.out.println("c = " + c);
        
        var scanner = new Scanner(System.in);
        edad = Integer.parseInt(scanner.nextLine());
        System.out.println("edad = " + edad);
        
        char caracter = scanner.nextLine().charAt(0);
        System.out.println("Caracter = " + caracter);

        String edadTexto = String.valueOf(25F);
        System.out.println("edadTexto = " + edadTexto);
    }
}
