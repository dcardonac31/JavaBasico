
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        int a = 3, b = 2;
        
        int resultado = a + b;
        System.out.println("resultado = " + resultado);
        
        System.out.println("resultado = " + (a + b) );
        
        resultado = a - b;
        System.out.println("resultado resta = " + resultado);
        
        System.out.println("resultado resta = " + (a - b));
        
        resultado = a * b;
        System.out.println("resultado multiplicacion = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division = " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo = " + resultado);
        
        resultado = a % 2;
        System.out.println("resultado = " + resultado);

        resultado = b % 2;
        System.out.println("resultado = " + resultado);
        
        if(resultado == 0)
            System.out.println("es numero par");
        else
            System.out.println("es numero impar");
        
        
        

    }
}
