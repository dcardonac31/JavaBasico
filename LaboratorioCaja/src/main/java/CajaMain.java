import java.util.Scanner;

public class CajaMain {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        int volumen = 0;
        System.out.println("Ingrese Ancho: ");
        int ancho = scanner.nextInt();
        System.out.println("Ingrese Alto: ");
        int alto = scanner.nextInt();
        System.out.println("Ingrese Profundo: ");
        int profundo = scanner.nextInt();
        
        Caja caja = new Caja(ancho, alto, profundo);
        
        volumen = caja.calcularVolumen();
        
        System.out.println("");
        System.out.println("El volumen de la caja es: "+ volumen);

        
}
    
}
