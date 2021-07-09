
import java.util.Scanner;

public class HolaMundo {

    public static void main(String[] args) {

        //byte, short, int, long
        byte byteVar = 127;
        System.out.println("byteVar = " + byteVar);

        System.out.println("bits tipo byte: " + Byte.SIZE);
        System.out.println("bytes tipo byte: " + Byte.BYTES);
        System.out.println("valor minimo tipo byte: " + Byte.MIN_VALUE);
        System.out.println("valor maximo tipo byte: " + Byte.MAX_VALUE);

        System.out.println("--------------------------------------");

        short shortVar = 1000;
        System.out.println("shortVar = " + shortVar);

        System.out.println("bits tipo short: " + Short.SIZE);
        System.out.println("bytes tipo short: " + Short.BYTES);
        System.out.println("valor minimo tipo short: " + Short.MIN_VALUE);
        System.out.println("valor maximo tipo short: " + Short.MAX_VALUE);

        System.out.println("--------------------------------------");

        short intVar = 5000;
        System.out.println("intVar = " + intVar);

        System.out.println("bits tipo int: " + Integer.SIZE);
        System.out.println("bytes tipo int: " + Integer.BYTES);
        System.out.println("valor minimo tipo int: " + Integer.MIN_VALUE);
        System.out.println("valor maximo tipo int: " + Integer.MAX_VALUE);

        System.out.println("--------------------------------------");

        long longVar = 5000000064546464451L;
        System.out.println("longVar = " + longVar);

        System.out.println("bits tipo long: " + Long.SIZE);
        System.out.println("bytes tipo long: " + Long.BYTES);
        System.out.println("valor minimo tipo long: " + Long.MIN_VALUE);
        System.out.println("valor maximo tipo long: " + Long.MAX_VALUE);


    }
}
