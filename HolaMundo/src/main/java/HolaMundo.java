
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        int a = 10;
        int valorMinimo = 0, valorMaximo = 10;
        boolean resultado = a >= valorMinimo && a <= valorMaximo;
        System.out.println("resultado = " + resultado);
        
        boolean vacaciones = false;
        boolean diaDescanso = false;
        if(vacaciones || diaDescanso)
            System.out.println("Padre puede asistir al juego delm hijo");
        else
            System.out.println("Pasdre ocupado");

        

        

    }
}
