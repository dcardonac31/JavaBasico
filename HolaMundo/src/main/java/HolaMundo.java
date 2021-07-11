
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        var scanner = new Scanner(System.in);
        
        var x = 5;
        var y = 10;
        var z = ++x + y--;//x=6, y=10, z=16
        System.out.println("x = " + x);
        System.out.println("y = " + y);
        System.out.println("z = " + z);
        
    }
}
