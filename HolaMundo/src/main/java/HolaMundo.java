
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        //boolean
        System.out.println("True tipo boolean:" + Boolean.TRUE);
        System.out.println("False tipo boolean:" + Boolean.FALSE);
        
        boolean booleanVar = true;
        
        if(booleanVar){
            System.out.println("El valor es verdadero");
        }
        else{
            System.out.println("El valor es false");
        }
        
        System.out.println("");
        
        var edad = 10;
        var esAdulto = edad >= 18;
        System.out.println("esAdulto: " + esAdulto);

    }
}
